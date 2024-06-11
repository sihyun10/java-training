package training.collection.list;

public class Book {
    private final String name;
    private final int pages;
    private final int day;

    public Book(String name, int pages, int day) {
        this.name = name;
        this.pages = pages;
        this.day = day;
    }

    public String getName() {
        return name;
    }

    public int getDay() {
        return day;
    }

    public int getPages() {
        return pages;
    }
}
