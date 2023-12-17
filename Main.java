package pro1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student("Dhara", "bala", 1, 75, 1);
        Student student2 = new Student("sam", "jason", 2, 85, 1);

        // Create a course
        Courses mathCourse = new Courses("Math", "Prof. jansifolra", 2023);

        // Enroll students
        mathCourse.enroll(student1);
        mathCourse.enroll(student2);

        // Display information
        System.out.println("Number of students in Math course: " + mathCourse.countStudents());
        System.out.println("Best grade in Math course: " + mathCourse.bestGrade());
        mathCourse.studentRanking();
        mathCourse.aboveAverage();
    }

	

}
