package by.suhareva.model.dao.bookDAO;

import by.suhareva.constants.SQLRequest;
import by.suhareva.model.entities.Book;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface BooksRepo extends CrudRepository<Book,Long> {

    @Modifying
    @Query(SQLRequest.UPDATE_BOOK)
    void update(@Param("title") String title, @Param("text") String text,
                @Param("publisher") String publisher, @Param("year") int year,
                @Param("author") String author, @Param("id") long id);


}
