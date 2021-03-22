import java.util.*;

public class GWStudent extends GWPerson{
    protected int classYear; //e.g., class of 2024

    public GWStudent(String fname, String lname, String GWID, String uname, int classYear){
        super(fname,lname,GWID,uname);
        this.classYear=classYear;
    }

    //implmenting abstract method
    public String email(){
        return uname+"@gwmail.gwu.edu";
    }


    //overwriting super method
    public String toString(){
        return super.toString()+" -- Class of "+this.classYear;
    }

    //adding new static method
    public static GWStudent read(Scanner sc){
        String fname = sc.next();
        String lname = sc.next();
        String GWID = sc.next();
        String uname = sc.next();
        int year = sc.nextInt();
        return new GWStudent(fname,lname,GWID,uname,year);
    }


}
