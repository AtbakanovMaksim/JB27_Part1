package сom.epam.jb27.maksim_atbakanau.lesson9.Books;

public class StudentBook extends Book {
    private int course;

    public StudentBook(String name, String author, int yearPublished, int price, int course) {
        super(name, author, yearPublished, price);
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student book: \"" + getName() +
                "\", author: " + getAuthor() +
                ", yearPublished: " + getYearPublished() +
                ", price: " + getPrice() +
                ", course: " + course;
    }
}
