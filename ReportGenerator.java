import java.util.*;
public class ReportGenerator {
    // Query users for amounts of the
    // expense categories listed in
    // array e, and output expense report.
    public static void create(Expense[] e) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < e.length; i++) {
            e[i].ask(sc);
        }

        System.out.println();
        double total = 0.0;

        for (int i = 0; i < e.length; i++) {
            double x = e[i].getAmount();
      
            //round up to the nearest penny
            double y = Math.floor(x * 100 + 0.5) / 100.0;
      
            total += y;
      
            //format print all pretty
            System.out.printf(" $%07.2f\t%s\n", y, e[i].getDescrip());
        }
        //print the total
        System.out.printf("---------\n $%07.2f\ttotal\n", total);
    }
}

