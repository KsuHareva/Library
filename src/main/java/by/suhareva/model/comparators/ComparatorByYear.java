package by.suhareva.model.comparators;

import by.suhareva.model.entities.Book;

import java.util.Comparator;

public class ComparatorByYear implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        if (book2.getYear() < book1.getYear())
            return -1;
        else if (book2.getYear() > book1.getYear())
            return 1;
        else return 0;
    }
}
