package сom.epam.jb27.maksim_atbakanau.lesson9.Books;

public class FantasticBook extends Book {
    private String style;

    public FantasticBook(String name, String author, int yearPublished, int price, String style) {
        super(name, author, yearPublished, price);
        this.style = style;
    }

    @Override
    public String toString() {
        return "Fantastic book: \"" + getName() +
                "\", author: " + getAuthor() +
                ", yearPublished: " + getYearPublished() +
                ", price: " + getPrice() +
                ", style: " + style;
    }
}

