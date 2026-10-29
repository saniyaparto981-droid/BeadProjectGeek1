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
        return 0;
    }

    @Override
    public double distance(IBlob that) {
        return 0;
    }

    @Override
    public void setBlobCenter() {

    }

    @Override
    public ArrayList<IPixel> getPositions() {
        return null;
    }

    @Override
    public void setPositions(ArrayList<IPixel> positions) {

    }

    @Override
    public IPixel getBlobCenter() {
        return null;
    }
}
