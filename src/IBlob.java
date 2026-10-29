import java.util.ArrayList;

public interface IBlob {


    void add(double x, double y );
    int mass();


    double distance(IBlob that) ;


    String toString ();


    void setBlobCenter ();


    // -------------------- Getters & Setters --------------------

    ArrayList<IPixel> getPositions ();

    void setPositions (ArrayList < IPixel > positions);
    IPixel getBlobCenter ();





}
