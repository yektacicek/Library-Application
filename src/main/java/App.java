import java.util.List;

import Dao.BookDao;
import Model.Book;

public class App {
	public static void main(String[] args) {
		BookDao bd = new BookDao();
		List<Book> b = bd.getBooks();
		for (Book book : b) {
			System.out.println(book.toString());
		}

	}
}
