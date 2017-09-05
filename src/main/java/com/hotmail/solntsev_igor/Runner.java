package com.hotmail.solntsev_igor;

import com.hotmail.solntsev_igor.Model.BookModel;
import com.hotmail.solntsev_igor.persistence.HibernateUtil;
import org.hibernate.Session;

/**
 * Created by solncevigor on 8/9/17.
 */
public class Runner {
    public static void main(String[] args) {

        System.out.println("Maven + Hibernate + MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        BookModel bookModel = new BookModel();

        bookModel.setAuthor("Author111");
        bookModel.setPrice(12.31);
        bookModel.setYear("30.09.1989");
        bookModel.setBook_id(1);
        bookModel.setTitle("Title");

        session.save(bookModel);
        session.getTransaction().commit();
    }
}
