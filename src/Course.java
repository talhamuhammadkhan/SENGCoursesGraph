import java.util.ArrayList;

public class Course {
	private String name;
	private int credits;
	private int number;
	private ArrayList<Course> preReqs = new ArrayList<Course>();
	
	public Course(String name, int credits, int number) {
		this.name = name;
		this.credits = credits;
		this.number = number;
	}
	
	public Course() {
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Course> getPreReqs() {
		return preReqs;
	}
	public void setPreReqs(ArrayList<Course> preReqs) {
		this.preReqs = preReqs;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	@Override
	public String toString() {
		return name;
	}
			
}
