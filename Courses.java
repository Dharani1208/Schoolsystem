
package pro1;

import java.util.ArrayList;
import java.util.List;

public class Courses {
	String courseName;
    String professorName;
    int year;
    List<Student> enrolledStudents = new ArrayList<>();

    public Courses(String courseName, String professorName, int year) {
        this.courseName = courseName;
        this.professorName = professorName;
        this.year = year;
    }

    public void enroll(Student student) {
        enrolledStudents.add(student);
    }

    public void unEnroll(Student student) {
        enrolledStudents.remove(student);
    }

    public int countStudents() {
        return enrolledStudents.size();
    }

    public int bestGrade() {
        int maxGrade = Integer.MIN_VALUE;
        for (Student student : enrolledStudents) {
            maxGrade = Math.max(maxGrade, student.grade);
        }
        return maxGrade;
    }

    public void enroll(Student[] students) {
        for (Student student : students) {
            enroll(student);
        }
    }

    public double averageGrade() {
        if (enrolledStudents.isEmpty()) return 0;

        int totalGrades = 0;
        for (Student student : enrolledStudents) {
            totalGrades += student.grade;
        }
        return (double) totalGrades / enrolledStudents.size();
    }

    public void studentRanking() {
        enrolledStudents.sort((s1, s2) -> Integer.compare(s2.grade, s1.grade));

        System.out.println("Student Ranking:");
        for (Student student : enrolledStudents) {
            System.out.println(student.firstName + " " + student.lastName + ": " + student.grade);
        }
    }

    public void aboveAverage() {
        double average = averageGrade();

        System.out.println("Students Above Average:");
        for (Student student : enrolledStudents) {
            System.out.println(student.firstName + " " + student.lastName + ": " +
                               (student.grade > average ? "Above Average" : "Below Average"));
        }
    }

	
	

}
