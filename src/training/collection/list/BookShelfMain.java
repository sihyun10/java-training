package training.collection.list;

public class BookShelfMain {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();

        Book book1 = new Book("금단의 마술", 344, 5);
        Book book2 = new Book("허상의 어릿광대", 552, 6);
        Book book3 = new Book("백조와 박쥐", 568, 11);

        bookShelf.addBook(book1);
        bookShelf.addBook(book2);
        bookShelf.addBook(book3);

        bookShelf.displayBooks();
        bookShelf.amountReading();
    }
}
