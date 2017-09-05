package com.hotmail.solntsev_igor.DAO;

import com.hotmail.solntsev_igor.Model.BookModel;
import com.hotmail.solntsev_igor.persistence.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by solncevigor on 8/8/17.
 */
@Repository
public class BookDAOImplementation implements BookDAO {

    private BookModel bookModel;
    @Autowired
    SessionFactory sessionFactory;

    public void addBook(BookModel bookModel) {
        sessionFactory.getCurrentSession().persist(bookModel);
    }

    public void updateBook(BookModel bookModel) {
        sessionFactory.getCurrentSession().update(bookModel);
    }

    public void removeBook(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        BookModel bookModel = (BookModel) session.load(BookModel.class, new Integer(id));

        if (bookModel!=null){
            session.delete(bookModel);
        }
    }

    @Override
    public BookModel getBookByID(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        BookModel bookModel = (BookModel) session.load(BookModel.class, new Integer(id));
        return bookModel;
    }

    @Override
    public BookModel getBookByTitle(String title) {
        return null;
    }


    @SuppressWarnings("unchecked")
    public List<BookModel> listBooks() {
        Session session = this.sessionFactory.getCurrentSession();
        List<BookModel> bookModelList = session.createQuery("from bookmapping").list();

        return bookModelList;
    }
}
