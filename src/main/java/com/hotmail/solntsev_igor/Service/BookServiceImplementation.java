package com.hotmail.solntsev_igor.Service;

import com.hotmail.solntsev_igor.DAO.BookDAO;
import com.hotmail.solntsev_igor.Model.BookModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by solncevigor on 8/8/17.
 */
@Service("bookService")
@Transactional
public class BookServiceImplementation implements BookService {

    @Autowired
    private BookDAO bookDAO;

    @Override
    public void addBook(BookModel bookModel) {
        bookDAO.addBook(bookModel);
    }

    @Override
    public void updateBook(BookModel bookModel) {
        BookModel entity = bookDAO.getBookByID(bookModel.getBook_id());
        if (entity!=null){
            entity.setTitle(bookModel.getTitle());
            entity.setPrice(bookModel.getPrice());
            entity.setAuthor(bookModel.getAuthor());
            entity.setYear(bookModel.getYear());
        }
        //bookDAO.updateBook(bookModel);
    }

    @Override
    public void removeBook(int id) {
        bookDAO.removeBook(id);
    }

    @Override
    public BookModel getBookByID(int id) {
        return bookDAO.getBookByID(id);
    }

    @Override
    public BookModel getBookByTitle(String title) {
        return bookDAO.getBookByTitle(title);
    }

    @Override
    public List<BookModel> listBooks() {
        return bookDAO.listBooks();
    }

}
