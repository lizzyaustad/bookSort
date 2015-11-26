import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class BookList {
	

	public Book[] book;

	public BookList(Book[] b) {
		
		book = b;
	}
	
	public BookList (String filename) {
		File file = new File(filename);
		
		try {
			
		Scanner scanner = new Scanner(file);
		int books = 250; 
		
		
		Book[] bookss = new Book[books];
		for (int i=0; i<books; i++) {
			Book b = new Book (scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), i+1);
			bookss[i] = b;
			
		}
		book = bookss;
		scanner.close();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
