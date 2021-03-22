import java.util.*;

public abstract class GWPerson{
    protected String fname;
    protected String lname;
    protected String GWID;
    protected String uname;

    public GWPerson(String fname, String lname, String GWID, String uname){
        this.fname=fname;
        this.lname=lname;
        this.GWID=GWID;
        this.uname=uname;
    }

    public boolean before(GWPerson p){
        //last name not the same
        if(! this.lname.equals(p.lname)){ 
            return this.lname.compareTo(p.lname) < 0;
        }
        //first name not the same
        if(! this.fname.equals(p.fname)){
            return this.fname.compareTo(p.fname) < 0;
        }
        //first and last name the same, compare GWID's
        return this.GWID.compareTo(p.GWID)<0;
    }

    public String fullname(){
        return this.fname+" "+this.lname;
    }

    public String toString(){
        return this.lname+", "+this.fname+" ("+this.GWID+","+this.uname+")";
    }


    //We want to ensure that all GWPerson instances (be it a student
    //or a faculty) has a method email() that returns the correct
    //email. BUT we don't know how to implment here, so it must be
    //implemented in any class that REALIZES (or extends) this
    //abstract class.
    public abstract String email(); //<-- abstract
    
}

/*
  GWPerson p = ... (could a GWStudent/GWFaculty)
  ...

  System.out.println(p.email()); //<- not that this must work! 

  //Can never do something like `new GWPerson()` b/c GWPerson is
  //abstract class. It can never instantiated. But it can reference
  //other classes that derive from it.

 */
