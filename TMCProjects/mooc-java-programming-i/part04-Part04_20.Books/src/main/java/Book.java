public class Book {
    private String name;
    private int numberOfPages;
    private int publishedYear;

    public Book(String name, int page, int year) {
        this.name = name;
        this.numberOfPages = page;
        this.publishedYear = year;
    }

    public int getNumberOfPages() {
        return this.numberOfPages;
    }

    public int getPublishedYear() {
        return this.publishedYear;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String
    toString() {
        return
                name + ", " + numberOfPages +
                        " pages, " + publishedYear;

    }
}
