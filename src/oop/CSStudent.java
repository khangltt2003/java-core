package oop;

public class CSStudent extends Student {
    private int nlpScore;
    private int dbScore;

    public CSStudent() {
    }

    public CSStudent(String name, int age, double gpa, String studentId, int nlpScore, int dbScore) {
        super(name, age, gpa, studentId);
        this.major = "Computer Science";
        this.nlpScore = nlpScore;
        this.dbScore = dbScore;
    }

    @Override
    public double getFinalExamScore() {
        return 0.5 * this.dbScore + 0.5 * this.nlpScore;
    }

    @Override
    public void printInfo() {
        System.out.println("CSStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", studentId='" + studentId + '\'' +
                ", major='" + major + '\'' +
                ", gpa=" + gpa +
                ", final = " + getFinalExamScore() +
                '}');
    }
}
