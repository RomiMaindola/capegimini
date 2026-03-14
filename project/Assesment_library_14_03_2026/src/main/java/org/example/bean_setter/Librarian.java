package org.example.bean_setter;

public class Librarian {


    private  int libId;
    private String libName;
    private Book book;

    public Librarian() {
    }

    public Librarian(int libId, String libName, Book book) {
        this.libId = libId;
        this.libName = libName;
        this.book = book;
    }

    public int getLibId() {
        return libId;
    }

    public void setLibId(int libId) {
        this.libId = libId;
    }

    public String getLibName() {
        return libName;
    }

    public void setLibName(String libName) {
        this.libName = libName;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

public void issueBook(){
    System.out.println("Librarian: "+getLibName());
    getBook().displayBookDetails();
}

}
