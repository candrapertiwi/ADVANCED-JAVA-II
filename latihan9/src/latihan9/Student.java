package latihan9;

public class Student extends Subject{
	private String name;
	private int marks;
	
	public Student() {
		this("",0);
	}
	public Student(String name, int mark){
		
		this.name=name;
		this.marks=marks;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
}
