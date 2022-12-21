package by.suhareva.model.entities;

import by.suhareva.constants.AppConstants;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.relational.core.mapping.Table;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

@Table("books")
public class Book {
    private static SimpleDateFormat formatter = new SimpleDateFormat(AppConstants.OUTPUT_DATE_PATTERN);
    @Id
    private Long id;
    private String title;
    private String author;
    private int year;
    private String publisher;
    private Date date;
    private String text;


    public Book() {
    }

    public Book(Long id, String title, String author, int year, String publisher, Date date, String text) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
        this.publisher = publisher;
        this.date = date;
        this.text = text;
    }

    @PersistenceConstructor
    public Book(String title, String author, int year, String publisher, String text) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.publisher = publisher;
        this.text = text;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getStringDate() {
        return formatter.format(date);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(id, book.id)
                && Objects.equals(title, book.title)
                && Objects.equals(author, book.author)
                && Objects.equals(publisher, book.publisher)
                && Objects.equals(date, book.date)
                && Objects.equals(text, book.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", publisher='" + publisher + '\'' +
                ", date=" + date +
                ", text='" + text + '\'' +
                '}';
    }
}
