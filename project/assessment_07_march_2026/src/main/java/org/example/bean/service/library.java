package org.example.bean.service;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.bean.been.Author;
import org.example.bean.been.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class library {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
    EntityManager em = emf.createEntityManager();
    Scanner sc= new Scanner(System.in);


    public void create(){
        em.getTransaction().begin();


        int ch = sc.nextInt();
        System.out.print("give author name : ");
        String authorName = sc.next();
        System.out.print("give email id : ");
        String emailId = sc.next();
        Author author= new Author(authorName,emailId);
        System.out.print("No of book you want to enter : ");
        int num = sc.nextInt();
        List<Book> list = new ArrayList<>();
        for( int i =1;i<=num;i++) {
            System.out.print("give title name :");
            String title = sc.next();
            System.out.print("give price name :");

            int price =sc.nextInt();
            list.add(new Book(title,price,authorName));
        }
        author.setBooks(list);
        em.persist(author);
        em.getTransaction().commit();
        System.out.println(" inserted details ..........................");
    }

    public void read(){
        em.getTransaction().begin();
        List<Author> authors = em.createQuery("SELECT a FROM Author a", Author.class).getResultList();
        for( Author a: authors){
            System.out.println("author Id : "+a.getAuthorId());
            System.out.println("author name : "+a.getAuthorName());
            System.out.println(" book written .......................");
            List<Book> bo = new ArrayList<>();
            bo = a.getBooks();
            for(Book b: bo){
                System.out.println(b.getTitle()+"  "+b.getPrice());
            }
        }
        em.getTransaction().commit();
    }

    public void update(){
        System.out.print("give bookid  : ");
        int id= sc.nextInt();
        System.out.println("give the update price :");
        int price = sc.nextInt();
        em.getTransaction().begin();
        Book b = em.find(Book.class,id);
        System.out.println("book title : "+b.getTitle());
        System.out.println("old price  : "+b.getPrice());
        b.setPrice(price);
        em.getTransaction().commit();
    }

    public void delete(){
        System.out.print("give bookid  : ");
        int id= sc.nextInt();
        em.getTransaction().begin();
        ;
        Book b = em.find(Book.class,id);
        em.remove(b);
        em.getTransaction().commit();
}}
