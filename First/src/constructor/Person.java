package constructor;

public class Person {
	String name;
	float weight;
	float height;
	
	public Person() {}
	
	public Person(String pname) {
		name = pname;
	}
	
	public Person(String pname, float pweight, float pheight) {
		name = pname;
		height = pheight;
		weight = pweight;
	}
}
