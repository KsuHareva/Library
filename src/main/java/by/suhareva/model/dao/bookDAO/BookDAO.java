package by.suhareva.model.dao.bookDAO;

import by.suhareva.model.entities.Book;

import java.util.List;
import java.util.Optional;

public interface BookDAO {
    Book get(long id);

    List<Book> getAll();

    void save(Book book);

    void update(String title, String text, String publisher, int year, String author, long id);

    void deleteById(long id);

}
