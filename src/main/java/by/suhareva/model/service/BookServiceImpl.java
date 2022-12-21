package by.suhareva.model.service;

import by.suhareva.model.comparators.*;
import by.suhareva.model.dao.bookDAO.BookDAO;
import by.suhareva.model.entities.Book;
import by.suhareva.model.enums.CatalogsEnum;
import by.suhareva.model.enums.EnumManager;
import by.suhareva.model.enums.SortKind;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class BookServiceImpl implements BookService {
    private BookDAO bookDAO;


    @Autowired
    public void setBookDAO(BookDAO bookDAO) {
        System.out.println("service");
        this.bookDAO = bookDAO;
    }

    @Override
    public List<Book> getAll() {
        return (List<Book>) bookDAO.getAll();
    }

    @Override
    public void create(Book book) {
        bookDAO.save(book);
    }

    @Override
    public Book read(long id) {
        Book book = bookDAO.get(id);
        return book;
    }

    @Override
    public void remove(long id) {
        bookDAO.deleteById(id);
    }

    @Override
    public void edit(String title, String text, String publisher, int year, String author, long id) {
        bookDAO.update(title, text, publisher, year, author, id);
    }

    @Override
    public List<Book> sort(String sort) {
        List<Book> listSort = new ArrayList<>(bookDAO.getAll());
        SortKind sortKind = EnumManager.getSortKind(sort);
        switch (sortKind) {
            case TITLE: {
                Collections.sort(listSort, new ComparatorByTitle());
            }
            break;
            case PUBLISHER: {
                Collections.sort(listSort, new ComparatorByPublisher());
            }
            break;
            case YEAR: {
                Collections.sort(listSort, new ComparatorByYear());
            }
            break;
            case AUTHOR: {
                Collections.sort(listSort, new ComparatorByAuthor());
            }
            break;
            case DATE: {
                Collections.sort(listSort, new ComparatorByDate());
            }
            break;
        }
        return listSort;
    }

    @Override
    public Map<String, List<Book>> getCatalogs(String catalog) {
        CatalogsEnum catalogsEnum = EnumManager.getCatalogKind(catalog);
        List<Book> books = bookDAO.getAll();

        Map<String, List<Book>> mapBooks = new HashMap<>();
        for (Book book : books) {
            String key = null;
            switch (catalogsEnum) {
                case AUTHORS: {
                    key = book.getAuthor();
                }
                break;
                case PUBLISHER: {
                    key = book.getPublisher();
                }
                break;
                case YEAR: {
                    key = String.valueOf(book.getYear());
                }
                break;
            }
            List<Book> values = mapBooks.getOrDefault(key, new ArrayList<>());
            values.add(book);
            mapBooks.put(key, values);
        }
        return mapBooks;
    }

    @Override
    public List<Book> searchByTitle(String title) {
        List<Book> books = bookDAO.getAll();
        List<Book> bookFind = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                bookFind.add(book);
            }
        }
        return bookFind;
    }

}
