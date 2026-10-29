import edu.princeton.cs.algs4.Picture;

public class Factory {


    public static IPixel createPixel(double x , double y){return new Pixel(x,y);}

    public static IBeadFinder createBeadFinder(Picture picture,double tau, int min){return new BeadFinder(picture,tau , min);}

    public static IBlob createBlob(){return new Blob(); }

    public static IPictures createPicture(String rootName){return new Pictures(rootName );}

    public static IBeadTracker createBeadTracker(double delta , String rootName){return new BeadTracker(delta , rootName); }

}
