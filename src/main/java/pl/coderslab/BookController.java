package pl.coderslab;

import org.springframework.stereotype.Controller;

@Controller
public class BookController {
    private final BookDao bookDao;

    public BookController(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void save(Book book){
        bookDao.save(book);
    }
    public void edit(Book book){
        bookDao.update(book);
    }
    public void get(Book book){
        bookDao.findById(book.getId());
    }
    public void delete(Book book){
        bookDao.delete(book);
    }


}
