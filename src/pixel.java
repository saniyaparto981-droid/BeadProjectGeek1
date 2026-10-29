import java.util.ArrayList;
import java.util.LinkedList;

public class pixel implements IPixel {


    private double x;
    private double y;
    private IPixel fatherPixel;
    private ArrayList<IPixel> Children;

    public pixel(int x, int y){

        this.x=x;
        this.y=y;
        Children=new ArrayList();
        this.fatherPixel=null;

    }



    public double getX(){ return this.x;}
    public double getY(){return this.y;}
    public ArrayList<IPixel> getChildren(){return Children;}


    public void setFather(IPixel father){this.fatherPixel=father;}
    public IPixel getFather(){return this.fatherPixel;}


}
