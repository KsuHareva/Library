package by.suhareva.constants;

public class SQLRequest {

    public static final String UPDATE_BOOK = "update books set title=:title, text=:text, publisher=:publisher, year=:year, author=:author, date=now() where  id=:id";
}
