package array;

public class ObjectCopy1 {
	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("Mt.taebaek", "Right come-Cho");
		bookArray1[1] = new Book("Demian", "Herman Hesse");
		bookArray1[2] = new Book("How to live", "Citizen Yoo");
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for(int i = 0; i < 3; i++) {
			bookArray2[i].showBookInfo();
		}
	}
}
