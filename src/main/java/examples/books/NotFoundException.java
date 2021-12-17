package examples.books;

public class NotFoundException extends Exception {
  public NotFoundException(String message) {
    super(message);
  }

  @Override
  public String getMessage() {
    return super.getMessage();
  }
}
