import java.util.Scanner;

public class StudentExpense {

    String studentName;
    double dailyBudget;
    double foodExpense;
    double travelExpense;
    double studyExpense;
    double otherExpense;

    double calculateTotalExpense() {
        return foodExpense + travelExpense + studyExpense + otherExpense;
    }

    double calculateRemainingAmount() {
        return dailyBudget - calculateTotalExpense();
    }
    
    boolean isWithinBudget() {
        return calculateTotalExpense() <= dailyBudget;
    }
    double calculateExceededAmount() {
        if (calculateTotalExpense() > dailyBudget) {
            return calculateTotalExpense() - dailyBudget;
        } else {
            return 0;
        }
    }

    String getBudgetStatus() {
        double totalExpense = calculateTotalExpense();

        if (totalExpense < dailyBudget) {
            return "Within Budget";
        } else if (totalExpense == dailyBudget) {
            return "Budget Fully Used";
        } else {
            return "Budget Exceeded";
        }
    }
    
    void displayExpenseReport() {
        double totalExpense = calculateTotalExpense();

        System.out.println("\n---------- DAILY EXPENSE REPORT ----------");
        System.out.println("Student Name      : " + studentName);
        System.out.println("Daily Budget      : " + dailyBudget);
        System.out.println("Food Expense      : " + foodExpense);
        System.out.println("Travel Expense    : " + travelExpense);
        System.out.println("Study Expense     : " + studyExpense);
        System.out.println("Other Expense     : " + otherExpense);
        System.out.println("Total Expense     : " + totalExpense);

        if (isWithinBudget()) {
            System.out.println("Remaining Amount  : " + calculateRemainingAmount());
        } else {
            System.out.println("Exceeded Amount   : " + calculateExceededAmount());
        }

        System.out.println("Budget Status     : " + getBudgetStatus());
        System.out.println("------------------------------------------");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentExpense student = new StudentExpense();

        System.out.print("Enter student name: ");
        student.studentName = sc.nextLine();

        System.out.print("Enter daily budget: ");
        student.dailyBudget = sc.nextDouble();

        System.out.print("Enter food expense: ");
        student.foodExpense = sc.nextDouble();

        System.out.print("Enter travel expense: ");
        student.travelExpense = sc.nextDouble();

        System.out.print("Enter study expense: ");
        student.studyExpense = sc.nextDouble();

        System.out.print("Enter other expense: ");
        student.otherExpense = sc.nextDouble();
 
        if (student.dailyBudget < 0 ||
            student.foodExpense < 0 ||
            student.travelExpense < 0 ||
            student.studyExpense < 0 ||
            student.otherExpense < 0) {

            System.out.println("Budget and expenses cannot be negative.");
        } else {
            student.displayExpenseReport();
        }

        sc.close();
    }
}