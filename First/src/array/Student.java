package array;

public class Student {
	int studentID;
	String name;
	public Student() {}
	public Student(int ID, String name) {
		this.studentID = ID;
		this.name = name;
	}
	public int getstudentID() {
		return studentID;
	}
	public void setstudentID(int ID) {
		this.studentID = ID;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public void showStudentInfo() {
		System.out.println("Name is " + name + ". and ID is " + studentID +".");
	}
}
