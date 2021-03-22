import java.util.*;
public class Expense {
    private String descrip;
    private double amount;

    public Expense(String descrip) {
        this.descrip = descrip;
        amount       = 0.0;
    }

    public void setAmount(double a) {
        amount = a;
    }

    public void ask(Scanner sc) {
        System.out.print("Enter dollar amount for "
                         + getDescrip()
                         + " (0 for none): ");
        amount = sc.nextDouble();
    }

    public String getDescrip() {
        return descrip;
    }

    public double getAmount() {
        return amount;
    }
}
