import java.util.*;
public class ReadPersons{

    public static void main(String args[]){

        GWPerson persons[] = new GWPerson[100];

        Scanner sc = new Scanner(System.in);

        //read in students and faculty
        int n=0;
        while(n<100){
            System.out.println("Select:\n"+
                               "(s) Student\n"+
                               "(f) Faculty\n"+
                               "(d) Done");
            String opt = sc.next();
            if(opt.equals("s")){
                persons[n++] = GWStudent.read(sc);
            }else if(opt.equals("f")){
                persons[n++] = GWFaculty.read(sc);
            }else if(opt.equals("d")){
                break;
            }else{
                System.out.println("Unknown option");
                continue;
            }
            System.out.println();
        }


        //before a bubble sort
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(!persons[i].before(persons[j])){
                    GWPerson tmp = persons[i];
                    persons[i] = persons[j];
                    persons[j] = tmp;
                }
            }
        }

        System.out.println();
        System.out.println("-----");
        System.out.println();

        //print out the info
        for(int i=0;i<n;i++){
            System.out.println(persons[i] + " -- " + persons[i].email()); 
        }
        
    }
}
