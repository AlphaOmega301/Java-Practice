package array;
import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<Book> library = new ArrayList<Book>();
		
		library.add(new Book("MT.Taebaek", "RightCome-Cho"));
		library.add(new Book("Demian", "Herman Hesse"));
		library.add(new Book("How to Live", "Citizen Yoo"));
		library.add(new Book("Earth", "Park"));
		library.add(new Book("Little Prince", "San tec"));
		
		for(int i = 0 ; i < library.size(); i++) {
			Book book = library.get(i);
			book.showBookInfo();
		}
		System.out.println();
		
		System.out.println("==���� For��");
		for(Book book : library) {
			book.showBookInfo();
		}
	}
}
