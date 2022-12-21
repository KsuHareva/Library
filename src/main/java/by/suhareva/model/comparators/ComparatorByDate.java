package by.suhareva.model.comparators;

import by.suhareva.model.entities.Book;

import java.util.Comparator;

public class ComparatorByDate implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        return book1.getDate().compareTo(book2.getDate());
    }
}
