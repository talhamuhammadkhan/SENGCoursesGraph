import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class CoursesGraph {
	static ArrayList<Course> courseList = new ArrayList<Course>();

	public static void addCourse(Course c) {
		courseList.add(c);
	}

	public static void addPrerequisite(Course pre, Course C) {
		C.getPreReqs().add(pre);
	}

	public static void displayGraph() {
		for (int i = 0; i < courseList.size(); i++) {
			System.out.println(
					courseList.get(i).toString() + " | prerequisites: " + courseList.get(i).getPreReqs().toString() + "\n");
		}
	}
	
	public static void showGraph() {
		for (int i = 0; i < courses.size(); i++) {
			System.out.println(
					courses.get(i).toString();
		}
	}
}
