package com.hotmail.solntsev_igor.Model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by solncevigor on 8/8/17.
 */

@Entity
@Table(name = "BOOKS")
public class BookModel implements Serializable {

    @Id
    @Column(name = "BOOK_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int book_id;

    @Column(name = "AUTHOR")
    private String author;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "PRICE")
    private double price;

    @Column(name = "YEAR")
    private String year;

    public BookModel() {
    }

    public BookModel(String author, String title, double price, String year) {
        this.author = author;
        this.title = title;
        this.price = price;
        this.year = year;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "BookModel{" +
                "book_id=" + book_id +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", year=" + year +
                '}';
    }
}
