package сom.epam.jb27.maksim_atbakanau.lesson9.Comporators;

import сom.epam.jb27.maksim_atbakanau.lesson9.Books.Book;

import java.util.Comparator;

public class ComparatorByPrice implements Comparator<Book> {
    public int compare(Book b1, Book b2) {
        int price1 = b1.getPrice();
        int price2 = b2.getPrice();
        if (price1 < price2) {
            return -1;
        } else if (price1 == price2) {
            return (b1.getName().compareToIgnoreCase(b2.getName()));
        } else {
            return 1;
        }
    }
}
