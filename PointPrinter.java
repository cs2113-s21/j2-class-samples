import java.util.*;

public class PointPrinter{

    public static void main(String args[]){

        Point v = new Point(3,4);
        Point w = new Point(5,2);
        LabPoint x = new LabPoint(10,20,"A");
        
        System.out.println(v); //Point's toString 
        System.out.println(w); // ^ ^
        System.out.println(x); //LabPoint toString

        //LabPoint is-a Point
        Point y = x; //<- totally cool to do this assignment

        //Java knew that y was truly a LabPoint ...
        System.out.println(y); //<-- that's why this printed the label

        //Is this runtime determination or a compile time determination?

        Random rand = new Random(/*seeded with current time*/);
        //The compiler doesn't know the state of the random object. It
        //is only known when the program is run.

        // IT MUST BE A RUNTIME DETERMINATION!
        
        //No way a compiler can tell which assignment is going to occur
        Point u;
        if(rand.nextBoolean()){
            u = w; //u references a Point 
        }else{
            u = x; //u references a LabPoint
        }

        System.out.println(u); //how can the compiler know which toString()


        //There implicite type argument that is carried with every
        //method call of a class.

        // u.toString() --> which version is determined by the TRUE type of u
        // Does u reference a Point or Does u reference a LabPoint ...?

        // THIS IS POLYMORPHISM
        // - the method that gets called is based on the true type of the references intance
        // - Not the declared type.


        System.out.println("-----------");
        //all points by inheritance
        Point points[] = {x,y,u,v,w}; //totally legit even if not all are truly Point's

        for(Point p : points){
            System.out.println(p.toString());
        }


        System.out.println("-----------");
        
        //Everything is a object
        Object objs[] = {x,y,u,v,w, 5,
            "String string string", new Object() };

        for(Object o : objs){
            System.out.println(o.toString()); //polymorphic function call

            //Java is only aware of the declared type at runtime
            //That declared type is Object!
            //Object does not have a sum_xy() method.
            //this is a compile error
            //System.out.prinlnt(o.sum_xy());

            //WE KNOW THAT SOME OF THESE ARE ACTUALLY POINTS (or LABPOINTS)!

            // I can do this if I knew the true type of o
            if(o instanceof Point){ //LabPoint is-a Point!
                Point p = (Point) o; //this cast must succeed
                System.out.println("sum: "+ p.sum_xy()); //now sum_xy is exposed as
                                                         //part of the declared
                                                         //type
            }
            else{
                System.out.println("sum: not a point...");
            }
            
        }

    }

}
