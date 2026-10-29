import edu.princeton.cs.algs4.Picture;

public class factory {


    public static IPixel createPoint(double x , double y){return new pixel(x,y);}

    public static IBeadFinder createBeadFinder(Picture picture,double tau, int min){return new BeadFinder(picture,tau , min);}

    public static IBlob createBlob(){return new Blob(); }

    public static IPictures createPicture(String rootName){return new Pictures(rootName );}

    public static IBeadTracker createBeadTracker(double delta , String rootName){return new BeadTracker(delta , rootName); }


}
