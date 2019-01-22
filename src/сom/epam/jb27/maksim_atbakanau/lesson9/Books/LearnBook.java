package сom.epam.jb27.maksim_atbakanau.lesson9.Books;

public class LearnBook extends Book {
    private String subject;

    public LearnBook(String name, String author, int yearPublished, int price, String subject) {
        super(name, author, yearPublished, price);
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Learn book: \"" + getName() +
                "\", author: " + getAuthor() +
                ", yearPublished: " + getYearPublished() +
                ", price: " + getPrice() +
                ", subject: " + subject;
    }
}
