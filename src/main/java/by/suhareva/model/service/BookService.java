package by.suhareva.model.service;

import by.suhareva.model.entities.Book;


import java.util.List;
import java.util.Map;

public interface BookService {
    List<Book> getAll();
    void create(Book book);
    Book read(long id);
    void remove(long id);
    void edit(String title, String text, String publisher, int year, String author, long id);
    List<Book> sort(String sort);
    Map<String, List<Book>> getCatalogs(String catalog);
    List<Book> searchByTitle(String title);

}
