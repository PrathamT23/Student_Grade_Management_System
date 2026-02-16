import java.util.ArrayList;

public class Student
{
	private String name;
	private ArrayList<Course> courses;
	
	public Student(String name)
	{
		this.name = name;
		this.courses = new ArrayList<>();
	}
	
	
	public void addCourse(String courseName, double grade, double creditHours)
	{
		Course course = new Course(courseName, grade, creditHours);
		courses.add(course);
	}
	
	
	public double calculateGPA()
	{
		double totalPoints = 0;
		int totalCredits = 0;
		
		for(Course c : courses)
		{
			totalPoints += c.getGrade() * c.getCreditHours();
			totalCredits += c.getCreditHours();
		}
		
		if(totalCredits == 0)
			return 0.0;
		
		return totalPoints / totalCredits;
	}
	
	
	public void displayRecord()
	{
		System.out.println("\nStudent: " + name);
		for(Course c : courses)
		{
			System.out.println(c.getCourseName() + " | Grade: " + c.getGrade() + " | Credits: " + c.getCreditHours());
		}
		System.out.printf("Current GPA: %.2f\n", calculateGPA());
	}
}