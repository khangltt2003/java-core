package oop;

public class MEStudent extends Student {
    private int psScore;
    private int elScore;

    public MEStudent() {
    }

    public MEStudent(String name, int age, double gpa, String studentId, int psScore, int elScore) {
        super(name, age, gpa, studentId);
        this.major = "Mechanical Engineering";
        this.psScore = psScore;
        this.elScore = elScore;
    }

    @Override
    public double getFinalExamScore() {
        return 0.2 * psScore + 0.8 * elScore;
    }

    @Override
    public void printInfo() {
        System.out.println("MEStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", studentId='" + studentId + '\'' +
                ", major='" + major + '\'' +
                ", gpa=" + gpa +
                ", final = " + getFinalExamScore() +
                '}');
    }
}
