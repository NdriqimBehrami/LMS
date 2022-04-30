package com.example.lms.entities;

import java.time.LocalDate;

public class Book {
    private long bookId;
    private String title;
    private int releaseYear;
    private int edition;
    private LocalDate returnDate = null;

    public Book(){

    }

    public Book(long bookId, String title, int releaseYear, int edition, LocalDate returnDate) {
        this.bookId = bookId;
        this.title = title;
        this.releaseYear = releaseYear;
        this.edition = edition;
        this.returnDate = returnDate;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }
}
