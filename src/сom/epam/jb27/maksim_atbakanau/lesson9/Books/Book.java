package сom.epam.jb27.maksim_atbakanau.lesson9.Books;

public class Book {
    private String name;
    private String author;
    private int yearPublished;
    private int price;

    public Book(String name, String author, int yearPublished, int price) {
        this.name = name;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (yearPublished != book.yearPublished) return false;
        if (price != book.price) return false;
        if (!name.equals(book.name)) return false;
        return author.equals(book.author);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + author.hashCode();
        result = 31 * result + yearPublished;
        result = 31 * result + price;
        return result;
    }

    @Override
    public String toString() {
        return "Book: \"" + name +
                "\", author: " + author +
                ", yearPublished: " + yearPublished +
                ", price: " + price;
    }
}
