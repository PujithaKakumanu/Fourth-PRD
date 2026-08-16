public class Student {

    String name;
    String courseName;
    int completedTopics;
    int questionsSolved;

    void setDetails(String name, String courseName) {
        this.name = name;
        this.courseName = courseName;
    }

    void setProgress(int completedTopics, int questionsSolved) {
        this.completedTopics = completedTopics;
        this.questionsSolved = questionsSolved;
    }

    void displayDetails() {
        System.out.println("Student Name : " + name);
        System.out.println("Course Name : " + courseName);
    }

    void displayProgress() {
        System.out.println("Completed Topics : " + completedTopics);
        System.out.println("Questions Solved : " + questionsSolved);
    }
    void addTopics(int newTopics) {
        completedTopics = completedTopics + newTopics;
    }

    void addQuestions(int newQuestions) {
        questionsSolved = questionsSolved + newQuestions;
    }
}