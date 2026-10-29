import java.util.ArrayList;

public interface IPixel {


     double getX();
     double getY();
     ArrayList<IPixel> getChildren();
     void setFather(IPixel father);
     IPixel getFather();
}
