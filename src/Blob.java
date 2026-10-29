import java.util.ArrayList;

public class Blob implements IBlob {


    private ArrayList<IPixel> positions;
    private IPixel blobCenter;

    @Override
    public void add(double x, double y) {
        positions.add(Factory.createPixel(x,y));
    }

    @Override
    public int mass() {
        return positions.size();
    }

    @Override
    public double distance(IBlob that) {
        return Math.sqrt(
                Math.pow(blobCenter.getX() - that.getBlobCenter().getX(), 2)
                        + Math.pow(blobCenter.getY() - that.getBlobCenter().getY(), 2)
        );
    }

    @Override
    public void setBlobCenter() {
        double x = 0;
        double y = 0;

        for (IPixel point : positions) {
            x += point.getX();
            y += point.getY();
        }

        blobCenter = Factory.createPixel(x/ positions.size(), y/ positions.size());
    }

    @Override
    public ArrayList<IPixel> getPositions() {
        return this.positions;
    }

    @Override
    public void setPositions(ArrayList<IPixel> positions) {
        this.positions=positions;

    }

    @Override
    public IPixel getBlobCenter() {
        return this.blobCenter;
    }
}
