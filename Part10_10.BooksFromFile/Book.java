
public class Book {

    private String name;
    private int publishingYear;
    private int pageCount;
    private String author;

    public Book(String name, int releaseYear, int pages, String author) {
        this.name = name;
        this.publishingYear = releaseYear;
        this.pageCount = pages;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public String getAuthor() {
        return author;
    }

    public int getPagecount() {
        return pageCount;
    }

    @Override
    public String toString() {
        return "\nName: " + this.name + ", Release Year: " + publishingYear + ", Pages: " + pageCount + ", Author: " + this.author;
    }

}

