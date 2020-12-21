package lecture12;

public class Student {
	private String StudentID;
	private String name;
	private double score;
	
	public Student(String StudentID, String name, double score) {
		this.StudentID=StudentID;
		this.name=name;
		this.score=score;
	}

	public String getStudentID() {
		return StudentID;
	}

	public void setStudentID(String studentID) {
		StudentID = studentID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
	
}
