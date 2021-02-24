package array;

public class BookArray2 {
	public static void main(String[] args) {
		Book[] library = new Book[5];
		
		library[0] = new Book("Mt.Tae-baek", "Right come Cho");
		library[1] = new Book("Demian", "Herman Hesse");
		library[2] = new Book("How to Live", "Citizen Yu");
		library[3] = new Book("Earth", "Sec Park");
		library[4] = new Book("Little Prince", "San tec zuitperry");
		
		for(int i = 0; i < library.length; i++) {
			library[i].showBookInfo();
		}
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
	}
}
