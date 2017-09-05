package com.hotmail.solntsev_igor.Controller;

import com.hotmail.solntsev_igor.Model.BookModel;
import com.hotmail.solntsev_igor.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by solncevigor on 8/8/17.
 */

@Controller
@RequestMapping("/welcom")
@ComponentScan("com.hotmail.solntsev_igor")
public class BookController {

    @Autowired
    private BookService bookService;

    // This method will list all existing employees.
    @RequestMapping(value = {"/","/list"},method = RequestMethod.GET)
    public List<BookModel> getAllBooks(){

        return bookService.listBooks();
    }

    @RequestMapping(value = "/addBook",method = RequestMethod.GET)
    public void addBook(BookModel bookModel){
        bookService.addBook(bookModel);
    }

    @RequestMapping(value = {"/by_title"},method = RequestMethod.GET)
    public void getBookByTitle(BookModel bookModel){
        bookService.getBookByID(bookModel.getBook_id());
    }

    public void removeBook(BookModel bookModel){
        bookService.removeBook(bookModel.getBook_id());
    }
}
