package сom.epam.jb27.maksim_atbakanau.lesson9.Comporators;

import сom.epam.jb27.maksim_atbakanau.lesson9.Books.Book;

import java.util.Comparator;

public class ComparatorByYear implements Comparator<Book> {
    public int compare(Book b1, Book b2) {
        int year1 = b1.getYearPublished();
        int year2 = b2.getYearPublished();
        if (year1 < year2) {
            return -1;
        } else if (year1 == year2) {
            return (b1.getName().compareToIgnoreCase(b2.getName()));
        } else {
            return 1;
        }
    }
}
