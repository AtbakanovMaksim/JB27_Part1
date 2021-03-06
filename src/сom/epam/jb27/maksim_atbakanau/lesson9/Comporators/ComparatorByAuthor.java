package сom.epam.jb27.maksim_atbakanau.lesson9.Comporators;

import сom.epam.jb27.maksim_atbakanau.lesson9.Books.Book;

import java.util.Comparator;

public class ComparatorByAuthor implements Comparator<Book> {
    public int compare(Book b1, Book b2) {
        String n1 = b1.getAuthor();
        String n2 = b2.getAuthor();
        return n1.compareToIgnoreCase(n2);
    }
}
