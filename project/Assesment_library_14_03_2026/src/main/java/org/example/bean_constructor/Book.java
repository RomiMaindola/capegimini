package org.example.bean_constructor;

public class Book {
    private int bookId;
    private String title;
    private String author;

    public Book() {
    }

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

       public void displayBookDetails(){
           System.out.println("Book Id  :- "+getBookId());
           System.out.println("title :- "+getTitle());
           System.out.println("Author :- "+getAuthor());

       }
}
