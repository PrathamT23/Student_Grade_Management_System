
public class Course
{
	private String courseName;
	private double grade;
	private double creditHours;
	
	public Course(String courseName, double grade, double creditHours)
	{
		this.courseName = courseName;
		this.grade = grade;
		this.creditHours = creditHours;
	}

	public String getCourseName() {
		return courseName;
	}

	public double getGrade() {
		return grade;
	}

	public double getCreditHours() {
		return creditHours;
	}
}