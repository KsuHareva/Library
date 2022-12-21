package by.suhareva.model.dao.bookDAO;

import by.suhareva.model.entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookSpringDataJDBCImpl implements BookDAO {

    private BooksRepo booksRepo;

    @Autowired
    public void setBooksRepo(BooksRepo booksRepo) {
        this.booksRepo = booksRepo;
    }

    @Override
    public Book get(long id) {
        return booksRepo.findById(id).get();
    }

    @Override
    public List<Book> getAll() {
        return (List<Book>) booksRepo.findAll();
    }

    @Override
    public void save(Book book) {
        booksRepo.save(book);
    }

    @Override
    public void update(String title, String text, String publisher, int year, String author, long id) {
        booksRepo.update(title, text, publisher, year, author, id);
    }

    @Override
    public void deleteById(long id) {
        booksRepo.deleteById(id);
    }
}
