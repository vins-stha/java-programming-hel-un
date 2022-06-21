import java.util.ArrayList;

public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public boolean bookExists(ArrayList<Book> books) {

        for (Book book : books) {
            if (this.equals(book)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Book book1) {
        if (book1.getName().equals(this.getName())
                && book1.getPublicationYear() == this.getPublicationYear()) {
            return true;
        }
        return false;
    }

}
