import java.util.ArrayList;

public class Course {
	public static final String AP3 = "AP3";
	public static final String ALG3 = "ALG3";
	public static final String IS3 = "IS3";
	public static final String PSD3 = "PSD3";
	public static final String PL3 = "PL3";
	//public static final String 
	
	private String courseName;
	private char courseGrade;
	private ArrayList<Assignment> assignment;

	// public static ArrayList<Grade> coursegrade = new ArrayList<Grade>();

	public Course(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public char getCourseGrade() {
		return courseGrade;
	}

	public void setCourseGrade(char courseGrade) {
		this.courseGrade = courseGrade;
	}

	public ArrayList<Assignment> getAssignment() {
		return assignment;
	}

	public void setAssignment(ArrayList<Assignment> assignment) {
		this.assignment = assignment;
	}

	/*
	 * public ArrayList<Grade> getCgrade() { return cgrade; } public void
	 * setCgrade(ArrayList<Grade> cgrade) { this.cgrade = cgrade; }
	 */

}
