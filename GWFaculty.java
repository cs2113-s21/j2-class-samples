import java.util.*;

public class GWFaculty extends GWPerson{
    protected String dept; //department

    public GWFaculty(String fname,String lname,String GWID,String uname,String dept){
        super(fname,lname,GWID,uname);
        this.dept=dept;
    }

    public String email(){
        return uname+"@email.gwu.edu";
    }

    public String toString(){
        return super.toString()+" -- "+this.dept;
    }

    //adding new static method
    public static GWFaculty read(Scanner sc){
        String fname = sc.next();
        String lname = sc.next();
        String GWID = sc.next();
        String uname = sc.next();
        String dept = sc.nextLine();

        return new GWFaculty(fname,lname,GWID,uname,dept);
    }

}
