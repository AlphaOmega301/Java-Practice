package constructor;

public class PersonTest {

	public static void main(String[] args) {
		Person personLee = new Person();
		personLee.name = "±Ë¿ØΩ≈";
		personLee.weight = 85.5F;
		personLee.height = 180.0F;
		
		Person personKim = new Person("±Ë¿ØΩ≈", 175, 75);
		
		System.out.println(personKim);
	}

}
