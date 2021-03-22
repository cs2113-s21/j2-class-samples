public class ExpenseReport {
  public static void main(String[] args) {
    Expense[] e = {
      new Expense("lodging"),
      new Expense("meals"),
      new Expense("incidentals")
    };
    ReportGenerator.create(e);
  }
}
