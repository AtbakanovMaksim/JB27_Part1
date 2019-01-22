package сom.epam.jb27.maksim_atbakanau.lesson9;

import сom.epam.jb27.maksim_atbakanau.lesson9.Books.Book;
import сom.epam.jb27.maksim_atbakanau.lesson9.Comporators.ComparatorByAuthor;
import сom.epam.jb27.maksim_atbakanau.lesson9.Comporators.ComparatorByName;
import сom.epam.jb27.maksim_atbakanau.lesson9.Comporators.ComparatorByPrice;
import сom.epam.jb27.maksim_atbakanau.lesson9.Comporators.ComparatorByYear;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Library {
    private List<Book> libraryBooks = new ArrayList<Book>();
    private Comparator<Book> comparatorByName = new ComparatorByName();
    private Comparator<Book> comparatorByAutor = new ComparatorByAuthor();
    private Comparator<Book> comparatorByPrice = new ComparatorByPrice();
    private Comparator<Book> comparatorByYear = new ComparatorByYear();

    public void addToLibrary(Book book) {
        libraryBooks.add(book);
    }

    public List<Book> getLibraryBooks() {
        return libraryBooks;
    }

    public void setLibraryBooks(List<Book> libraryBooks) {
        this.libraryBooks = libraryBooks;
    }

    public List<Book> findInLibrary(Book book) {
        List<Book> result = new ArrayList<>();

        for (Book i : libraryBooks) {
            if (i.equals(book)) {
                result.add(i);
            }
        }
        return result;
    }

    public List<Book> findInLibrary(String string) {
        List<Book> result = new ArrayList<>();

        for (Book i : libraryBooks) {
            if (i.getAuthor().contains(string)) {
                result.add(i);
                continue;
            }
            if (i.getName().contains(string)) {
                result.add(i);
                continue;
            }
            if (i.getClass().toString().contains(string)) {
                result.add(i);
                continue;
            }
        }
        return result;
    }

    public List<Book> findInLibrary(int number) {
        List<Book> result = new ArrayList<>();

        for (Book i : libraryBooks) {
            if (i.getYearPublished() == number) {
                result.add(i);
            }
        }
        return result;
    }

    public void deleteFromLibrary(List<Book> books) {
        for (Book i : books) {
            libraryBooks.remove(i);
        }
    }

    public void printAsList(List<Book> books) {
        if (books.size() == 0) {
            System.out.println("Books not found!");
        } else {
            for (Book i : books) {
                System.out.println(i.toString());
            }
        }
    }

    public void printAsTable(List<Book> books) {
        if (books.size() == 0) {
            System.out.println("Books not found!");
        } else {
            for (Book i : books) {
                System.out.format("+----------------------+----------------------+----------------------+----------------------+%n");
                String leftAlignFormat = "| %-20s | %-20s | %-20s | %-20s |%n";
                System.out.printf(leftAlignFormat, i.getName(), i.getAuthor(), i.getYearPublished(), i.getPrice());
                System.out.format("+----------------------+----------------------+----------------------+----------------------+%n");
            }
        }
    }

    public void sortByYear(List<Book> books) {
        Collections.sort(books, comparatorByYear);
    }

    public void sortByPrice(List<Book> books) {
        Collections.sort(books, comparatorByPrice);
    }

    public void sortByName(List<Book> books) {
        Collections.sort(books, comparatorByName);
    }

    public void sortByAuthor(List<Book> books) {
        Collections.sort(books, comparatorByAutor);
    }
}
