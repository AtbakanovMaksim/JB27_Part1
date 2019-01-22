package сom.epam.jb27.maksim_atbakanau.lesson9;

import сom.epam.jb27.maksim_atbakanau.lesson9.Books.Book;

import java.util.List;

public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library();
        Reader reader = new Reader();

        library.setLibraryBooks(reader.readLibraryListFromFile());
        List<Book> books = library.getLibraryBooks();
        library.printAsList(books);
        System.out.println();

        books = library.findInLibrary(2015);
        library.sortByPrice(books);
        library.printAsList(books);
        System.out.println();

        books = library.findInLibrary("King");
        library.printAsTable(books);
        System.out.println();

        books = library.findInLibrary("sagbab a ");
        library.printAsList(books);
        System.out.println();
    }

}
