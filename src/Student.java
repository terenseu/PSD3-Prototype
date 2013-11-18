import java.util.ArrayList;


public class Student {
	private String name;
	private String id;
	private ArrayList<Course> course = new ArrayList<Course>();

	public Student(String id, String name){
		this.name = name;
		this.id = id;

		course.add(new Course(Course.AP3));
		course.add(new Course(Course.ALG3));
		course.add(new Course(Course.IS3));
		course.add(new Course(Course.PSD3));
		course.add(new Course(Course.PL3));
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ArrayList<Course> getCourse() {
		return course;
	}


}
