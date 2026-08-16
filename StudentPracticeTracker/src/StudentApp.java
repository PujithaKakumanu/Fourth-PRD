import java.util.Scanner;
public class StudentApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.println("==============================");
        System.out.println("     STUDENT PRACTICE TRACKER");
        System.out.println("==============================");

        System.out.println();

        System.out.println("Enter Student Name:");
        String name = sc.nextLine();

        System.out.println();
        System.out.println("Enter Course Name:");
        String courseName = sc.nextLine();

        System.out.println();
        System.out.println("Enter Completed Topics:");
        int completedTopics = sc.nextInt();

        System.out.println();
        System.out.println("Enter Questions Solved:");
        int questionsSolved = sc.nextInt();

        student.setDetails(name, courseName);
        student.setProgress(completedTopics, questionsSolved);

        int choice = 0;

        while (choice != 5) {

            System.out.println();
            System.out.println("==============================");
            System.out.println("             MENU");
            System.out.println("==============================");

            System.out.println("1. View Student Details");
            System.out.println("2. View Progress");
            System.out.println("3. Add Completed Topics");
            System.out.println("4. Add Solved Questions");
            System.out.println("5. Exit");

            System.out.println();
            System.out.println("Enter your choice:");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println();
                    student.displayDetails();
                }

                case 2 -> {
                    System.out.println();
                    student.displayProgress();
                }

                case 3 -> {
                    System.out.println();
                    System.out.println("Enter New Completed Topics:");
                    int newTopics = sc.nextInt();

                    student.addTopics(newTopics);

                    System.out.println();
                    System.out.println("Topics updated successfully.");
                    System.out.println("Total Completed Topics : "
                            + student.completedTopics);
                }

                case 4 -> {
                    System.out.println();
                    System.out.println("Enter New Questions Solved:");
                    int newQuestions = sc.nextInt();

                    student.addQuestions(newQuestions);

                    System.out.println();
                    System.out.println("Questions updated successfully.");
                    System.out.println("Total Questions Solved : "
                            + student.questionsSolved);
                }

                case 5 -> {
                    System.out.println();
                    System.out.println("Thank you for using Student Practice Tracker.");
                    System.out.println("Keep Practicing!");
                }

                default -> {
                    System.out.println();
                    System.out.println("Invalid choice.");
                    System.out.println("Please enter a value between 1 and 5.");
                }
            }
        }

        sc.close();
    }
}