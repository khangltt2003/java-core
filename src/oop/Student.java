package oop;

public abstract class Student implements IStudent {
    //attributes
    protected String name;
    protected int age;
    protected double gpa;
    protected String studentId;
    protected String major;

    public Student() {
    }

    public Student(String name, int age, double gpa, String studentId) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.studentId = studentId;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMajor() {
        return this.major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    abstract void printInfo();

    abstract double getFinalExamScore();

    @Override
    public void sayHello() {
        System.out.println("Hello World from IStudent");
    }
}
