package training.collection.list;

import java.util.ArrayList;
import java.util.List;

public class BookShelf {
    private final List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("지금까지 읽은 책들");
        for (Book book : books) {
            System.out.println("책 제목: " + book.getName());
        }
    }

    public void amountReading() {
        System.out.println("총 " + books.size() + "권을 " + totalDays() + "일 동안 읽었다.");
        System.out.println("지금까지 읽은 총 페이지는 " + totalPages() + " 페이지이다.");
    }

    private int totalDays() {
        int totalDay = 0;
        for (Book book : books) {
            totalDay += book.getDay();
        }
        return totalDay;
    }

    private int totalPages() {
        int totalPages = 0;
        for (Book book : books) {
            totalPages += book.getPages();
        }
        return totalPages;
    }
}
