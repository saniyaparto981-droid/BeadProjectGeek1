import java.awt.Color;
import java.util.ArrayList;

public class BeadFinder {
    ArrayList<IBlob> blobs = new ArrayList<IBlob>();
    boolean[][] vis;
    IPixel pic;
    double tau;
    int min;
    int w, h;

    public BeadFinder(IPixel pic, double tau, int min) {
        this.pic = pic;
        this.tau = tau;
        this.min = min;
        w = pic.w();
        h = pic.h();
        vis = new boolean[w][h];
        for (int x = 0; x < w; x++)
            for (int y = 0; y < h; y++)
                if (on(x, y)) {
                    IBlob b = Factory.createBlob();
                    search(x, y, b);
                    b.setBlobCenter();
                    blobs.add(b);
                }
    }

    boolean on(int x, int y) {
        if (x < 0 || x >= w || y < 0 || y >= h || vis[x][y]) return false;
        Color c = pic.getPixel(x, y);
        int r = c.getRed(), g = c.getGreen(), b = c.getBlue();
        return ((r == g && r == b) ? r : 0.299 * r + 0.587 * g + 0.114 * b) >= tau;
    }

    void search(int x, int y, IBlob b) {
        if (!on(x, y)) return;
        vis[x][y] = true;
        b.add(x, y);
        search(x + 1, y, b);
        search(x, y + 1, b);
        search(x - 1, y, b);
        search(x, y - 1, b);
    }

    public IBlob[] getBeads(int min) {
        ArrayList<IBlob> a = new ArrayList<IBlob>();
        for (int i = 0; i < blobs.size(); i++)
            if (blobs.get(i).mass() >= min) a.add(blobs.get(i));
        return a.toArray(new IBlob[0]);
    }

    public static void main(String[] args) {
        IBlob[] b = new BeadFinder(Factory.createPixel(Double.parseDouble(args[2]), Double.parseDouble(args[3])), Double.parseDouble(args[1]), Integer.parseInt(args[0]))
            .getBeads(Integer.parseInt(args[0]));
        for (int i = 0; i < b.length; i++) System.out.println(b[i]);
    }
}
