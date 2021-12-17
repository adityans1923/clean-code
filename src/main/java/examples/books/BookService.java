package examples.books;

import java.util.ArrayList;
import java.util.List;

public class BookService {

  private List<String> books;
  public BookService(List<String> books) {
    this.books = books;
  }

  public boolean findBook(String bookName) throws NotFoundException {
    if(!books.contains(bookName)) {
      throw new NotFoundException(bookName + " does not exist");
    }
    return true;
  }
}



