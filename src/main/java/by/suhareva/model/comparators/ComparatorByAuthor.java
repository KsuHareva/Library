package by.suhareva.model.comparators;

import by.suhareva.model.entities.Book;

import java.util.Comparator;

public class ComparatorByAuthor implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        return book1.getAuthor().compareTo(book2.getAuthor());
    }
}
