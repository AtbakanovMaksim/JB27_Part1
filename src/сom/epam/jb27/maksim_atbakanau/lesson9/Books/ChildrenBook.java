package сom.epam.jb27.maksim_atbakanau.lesson9.Books;

public class ChildrenBook extends Book {
    private int childAge;

    public ChildrenBook(String name, String author, int yearPublished, int price, int childAge) {
        super(name, author, yearPublished, price);
        this.childAge = childAge;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + childAge;
        return result;
    }

    @Override
    public String toString() {
        return "Children book: \"" + getName() +
                "\", author: " + getAuthor() +
                ", yearPublished: " + getYearPublished() +
                ", price: " + getPrice() +
                ", childAge: " + childAge;
    }
}
