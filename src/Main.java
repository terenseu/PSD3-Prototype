import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	public static void selection(int i){
		boolean exit = false;



		while (exit != true){
			Scanner scanner = new Scanner(System.in);

			switch(i){
			case 1:{

				gradesMenu();
				break;
			}
			case 2:{

				gradesMenu();
				break;

			}

			case 3:{

				gradesMenu();
				break;
			}


			case 4:{

				gradesMenu();
				break;
			}
			case 5:{
				// Quit
				exit = true;
				System.out.println("You are now exiting the program.");
				break;
			}
			case 6:{

			}
			}
		}
	}

	public static void gradesMenu(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("GRADES MENU");
		System.out.println("Select your choice with the number that represents it.");
		System.out.println("1. View One Student's Courses Grades");
		System.out.println("2. View All Students Grades In A Course");
		System.out.println("3. Export Grades For One Student");
		System.out.println("4. Export All Grades");
		System.out.println("5. Quit");

		int number = scanner.nextInt();
		if ((number > 0) && (number < 6)){
			selection(number);
		}else {
			System.err.println("Please select from choice 1 to 5\n");
			gradesMenu();
		}
		scanner.close();
	}

	public static void addStudents(){
		Student a = new Student("2109988G", "BingLu");
		Student b = new Student("2109992L", "Joselyn");
		Student c = new Student("21100025T", "YongQuan");
		Student d = new Student("2110003L", "Terence");
		Student e = new Student("2109930T", "TingWen");
	}

	public static void main(String[] args) {
		//Setting student info and adding assignment to course
		//Create student object with course arraylist
		Student s = new Student("2110004L", "Joe");
		//Retrieve course arraylist from student
		ArrayList<Course> c = s.getCourse();
		//Get a course from the student
		Course ap3 = c.get(0);
		//Set Course Grade
		ap3.setCourseGrade(Grade.A);
		//Add assignment and grade to the course
		//ap3.getAssignment().add(new Assignment("Assignment 1", "A"));

		Student joe = new Student("2110004L", "Joe");
		
		addCourseGrade(joe, Course.AP3, Grade.A);
		
		addAssignmentGrade(joe, Course.AP3, "Assignment 1", Grade.A);
	}

	public static void addCourseGrade(Student student, String course, char grade) {
		for (Course c : student.getCourse()) {
			if (c.getCourseName().equals(course)) {
				c.setCourseGrade(grade);

				break;
			}
		}
	}

	public static void addAssignmentGrade(Student student, String course, String assignment, char grade) {
		for (Course c : student.getCourse()) {
			if (c.getCourseName().equals(course)) {
				c.getAssignment().add(new Assignment(assignment, grade));
			}
		}

	}
}
