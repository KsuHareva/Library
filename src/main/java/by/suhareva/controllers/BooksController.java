package by.suhareva.controllers;

import by.suhareva.constants.AppConstants;
import by.suhareva.model.entities.Book;
import by.suhareva.model.enums.CatalogsEnum;
import by.suhareva.model.enums.EnumManager;
import by.suhareva.model.enums.ProductAction;
import by.suhareva.model.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
public class BooksController {
    private BookService bookService;

    @Autowired
    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping(value = AppConstants.BOOK_All_URL, method = RequestMethod.GET)
    public String all(Model model) {
        model.addAttribute(AppConstants.BOOKS_LIST_ATTR, bookService.getAll());
        return AppConstants.BOOKS_PAGE;
    }

    @RequestMapping(value = AppConstants.BOOK_ADD_URL, method = RequestMethod.GET)
    public ModelAndView add() {
        ModelAndView modelAndView = new ModelAndView(AppConstants.ADD_BOOK_PAGE,
                AppConstants.BOOK_ATTR, new Book());
        return modelAndView;
    }


    @RequestMapping(value = AppConstants.BOOK_CREATE_URL, method = RequestMethod.POST)
    public String create(Book book) {
        book.setDate(new Date());
        bookService.create(book);
        return "redirect:" + AppConstants.BOOK_All_URL;
    }

    @RequestMapping(value = AppConstants.BOOK_READ_URL, method = RequestMethod.GET)
    public String read(long id, String action, Model model) {
        Book book = bookService.read(id);
        model.addAttribute(AppConstants.BOOK_ATTR, book);

        ProductAction productAction = EnumManager.getKindProductAction(action);
        String URL_PAGE = null;
        if (productAction == ProductAction.VIEW) {
            URL_PAGE = AppConstants.BOOK_VIEW_PAGE;
        } else {
            URL_PAGE = AppConstants.BOOK_EDIT_PAGE;
        }
        return URL_PAGE;
    }

    @RequestMapping(value = AppConstants.BOOK_UPDATE_URL, method = RequestMethod.POST)
    public String edit(String title, String text, String publisher, int year, String author, long id) {
        bookService.edit(title, text, publisher, year, author, id);
        return "redirect:" + AppConstants.BOOK_All_URL;
    }

    @RequestMapping(value = AppConstants.BOOK_DELETE_URL, method = RequestMethod.GET)
    public String delete(long id) {
        bookService.remove(id);
        return "redirect:" + AppConstants.BOOK_All_URL;
    }

    @RequestMapping(value = AppConstants.BOOK_SORT_URL)
    public String sort(String kind, Model model) {
        model.addAttribute(AppConstants.BOOKS_LIST_ATTR, bookService.sort(kind));
        return AppConstants.BOOKS_LIST_ATTR;
    }

    @RequestMapping(value = AppConstants.BOOK_CATALOG_URL, method = RequestMethod.GET)
    public ModelAndView getCatalog(String catalog, String key) {
        ModelAndView model = new ModelAndView();

        Map<String, List<Book>> booksMap = bookService.getCatalogs(catalog);
        model.addObject(catalog, booksMap.keySet());
        model.setViewName(AppConstants.INDEX_PAGE);

        if (key != null) {
            model.addObject(AppConstants.BOOKS_LIST_ATTR, booksMap.get(key));
            model.setViewName(AppConstants.BOOKS_PAGE);
        }
        return model;
    }

    @RequestMapping(value = AppConstants.BOOK_SEARCH_URL, method = RequestMethod.POST)
    public String search(String title, Model model) {
        List<Book> books = bookService.searchByTitle(title);
        model.addAttribute(AppConstants.BOOKS_LIST_ATTR, books);
        return AppConstants.BOOKS_PAGE;
    }


}
