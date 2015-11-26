

public class MergeSort {

	public static void main(String[] args) {
		
		BookList booklist = new BookList("./booklist.txt");
		BookList b = booklist;
				
		genreSep(b, "classics");
		genreSep(b, "fiction");
		genreSep(b, "religion");
		genreSep(b, "non-fiction");
		genreSep(b, "poetry");
		
	}
	
	public static void genreSep(BookList b, String g){
		int num = 0;
		for (int i=0; i<b.book.length; i++) {
			if (b.book[i].genre.equals(g)) {
				num++;
			}		
		}
		Book[] genre = new Book[num];
		int j=0;
		for (int i=0; i<b.book.length; i++) {
			if (b.book[i].genre.equals(g)) {
				genre[j++]=b.book[i];
			}		
		}
		Book[] genresort = insertionSort(genre);
		toString(genresort, g);
	}
	
	public static void toString(Book[] b, String g) {
		System.out.println();
		System.out.println(g+" - "+b.length);
		for (int i=0; i<b.length; i++) {
			System.out.println(b[i].author+", "+b[i].title + " (" +b[i].pos +")");
		}
	}
	
	public static Book[] insertionSort(Book[] list) {
		Book[] sorted = new Book[list.length];
        for (int i = 0; i < list.length; i++) {
            sorted[i] = list[i];
            // find the insertion location while moving all larger element up
            int j = i;
            while (j > 0 && (list[j - 1].author.compareTo(sorted[i].author)>0)) {
                list[j] = list[j - 1];
                j--;
            }
            // insert the element
            list[j] = sorted[i];	
        }
        return list;
    }
}
	
	