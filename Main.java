import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter student name: ");
		String name = s.nextLine();
		
		Student student = new Student(name);
		
		boolean running = true;
		
		while(running)
		{
			System.out.println("\n1. Add Course");
			System.out.println("2. View Record");
			System.out.println("3. Exit");
			System.out.print("Choose option: ");
			
			int choice = s.nextInt();
			
			switch(choice)
			{
			case 1:
				s.nextLine();
				
				System.out.print("Course name: ");
				String courseName = s.nextLine();
				
				System.out.println("Grade (0.0 - 4.0): ");
				double grade = s.nextDouble();
				
				System.out.println("Credit hours (0.0 - 4.0): ");
				double credits = s.nextDouble();
				
				student.addCourse(courseName, grade, credits);
				System.out.println("Course added successfully!");
				break;
				
			case 2:
				student.displayRecord();
				break;
				
			case 3:
				running = false;
				System.out.println("Exiting program...");
				break;
				
			default:
				System.out.println("Invalid option.");
			}
		}
		s.close();
	}
}