package org.example.beans;

public class book {
 private int isbn;
 private String title;
 private String author;
 private int price;
 private int autoId;

 public int getIsbn() {
  return isbn;
 }
public book(){};
 public int getAutoId() {
  return autoId;
 }

 @Override
 public String toString() {
  return "book{" +
          "isbn=" + isbn +
          ", title='" + title + '\'' +
          ", author='" + author + '\'' +
          ", price=" + price +
          ", autoId=" + autoId +
          '}';
 }

 public void setAutoId(int autoId) {
  this.autoId = autoId;
 }

 public String getTitle() {
  return title;
 }

 public String getAuthor() {
  return author;
 }

 public int getPrice() {
  return price;
 }

 public void setIsbn(int isbn) {
  this.isbn = isbn;
 }

 public void setTitle(String title) {
  this.title = title;
 }

 public void setAuthor(String author) {
  this.author = author;
 }

 public void setPrice(int price) {
  this.price = price;
 }

}
