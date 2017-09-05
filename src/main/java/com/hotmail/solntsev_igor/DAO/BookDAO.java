package com.hotmail.solntsev_igor.DAO;

import com.hotmail.solntsev_igor.Model.BookModel;

import java.util.List;

/**
 * Created by solncevigor on 8/8/17.
 */
public interface BookDAO {
    public void addBook(BookModel bookModel);

    public void updateBook(BookModel bookModel);

    public void removeBook(int id);

    public BookModel getBookByID(int id);

    public BookModel getBookByTitle(String title);

    public List<BookModel> listBooks();

}
