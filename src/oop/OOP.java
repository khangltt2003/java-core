package oop;

import java.util.ArrayList;
import java.util.List;

public class OOP {
    public static void main(String args[]) {
        Student student1 = new CSStudent("Ab Nguyen", 20, 3.9, "asdb213", 70, 90);
        Student student2 = new CSStudent("Bc Le", 22, 3.5, "zxczx123", 40, 60);
        Student student3 = new MEStudent("Cd Nguyen", 15, 2.0, "xvwe1245", 40, 60);
        Student student4 = new MEStudent("De Tran", 49, 3.1, "werwer123", 20, 80);
        Student student5 = new CSStudent("Ef Pham", 10, 1.0, "zxcvsd231", 60, 30);
        Student student6 = new CSStudent("Fg Le", 18, 3.7, "hggww654", 100, 90);
//        studentList.add(student1);
//        studentList.add(student2);
        student1.sayHello();
        List<Student> studentList = new ArrayList<>(List.of(student1, student2, student3, student4, student5, student6));
        for (Student student : studentList) {
            student.printInfo();
//            if (student.getGpa() > 3.0) {
//                student.printInfo();
//            }
//            if (student.getMajor().equals("Computer Science")) {
//                student.printInfo();
//            }
//            if (student.getName().endsWith("Nguyen") || student.getName().endsWith("Pham")) {
//                student.printInfo();
//            }
        }
    }

}
