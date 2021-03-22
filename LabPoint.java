public class LabPoint extends Point{

    private String lab;

    public LabPoint(double x, double y, String lab){
        super(x,y); //goes to our Point
        this.lab = lab;
    }

    //...

    public double sum_xy(){
        return -super.sum_xy();
    }
    public String toString(){
        return super.toString()+ " " + lab;
    }
}
