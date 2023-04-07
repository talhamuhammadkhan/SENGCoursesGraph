import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		System.out.println(
				"Welcome to your DMSE Manager! Press 1 to add a course, 2 to add a prerequisite, 3 to display the graph and 4 to quit.");
		int choice = scnr.nextInt();

		while (choice != 4) {
			switch (choice) {
			case 1:
				System.out.println("Enter the name of the course.");
				String name = scnr.next();
				System.out.println("Enter the number of credits.");
				int credits = scnr.nextInt();
				System.out.println("Enter the course number.");
				int number = scnr.nextInt();
				Course course = new Course(name, credits, number);
				CoursesGraph.addCourse(course);
				break;

			case 2:
				System.out.println("Enter the name of the course you want to add a prerequisite to.");
				String courseName = scnr.next();
				Course currCourse = new Course();
				for (int i = 0; i < CoursesGraph.courseList.size(); i++) {
					if (CoursesGraph.courseList.get(i).getName().equals(courseName)) {
						currCourse = CoursesGraph.courseList.get(i);
					}
				}
				System.out.println(
						"Enter one by one the name, credits and number of the course you want to add as a prerequisite.");
				String preReqName = scnr.next();
				int preReqCredits = scnr.nextInt();
				int preReqNumber = scnr.nextInt();
				Course preReq = new Course(preReqName, preReqCredits, preReqNumber);
				CoursesGraph.addPrerequisite(preReq, currCourse);
				break;

			case 3:
				CoursesGraph.displayGraph();
				break;

			case 4:
				System.out.println("Thanks for using our application!");
				break;

			default:
				System.out.println("Incorrect input");
				break;
			}

			System.out.println(
					"What would you like to do now? Press 1 to add a course, 2 to add a prerequisite, 3 to display the graph and 4 to quit.");
			choice = scnr.nextInt();
		}

	}
	
}
