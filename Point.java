public class Point{

    private double x,y;

    public Point(double x,double y){
        this.x = x;
        this.y = y;
    }

    //.....

    public double sum_xy(){
        return this.x+this.y;
    }
    
    public String toString(){
        return ""+this.x+" "+this.y;
    }

}
