package org.example.dao;
import org.example.beans.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import  java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;



public class operation implements Ioperation{
static Connection con;
static {
    try{
con= DriverManager.getConnection("jdbc:mysql://localhost:3306/DEPARTMENT","root","1234");
        System.out.println("connection establish");
    }
    catch(SQLException e){
        System.out.println(e.getMessage());
    }
}

    @Override
    public  List<String> bookTitle(String authorName) {
        List<String> list = new ArrayList<>();
    try {

        PreparedStatement ps = con.prepareStatement("SELECT * FROM auth a JOIN book b ON a.authId = b.authId where a.first_Name  =?");
        ps.setString(1,authorName);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            list.add(rs.getString("title"));
        }

    }
    catch(SQLException e){
        System.out.println(e.getMessage());
    }
        return list;
    }


    @Override
    public String Add(String author, String title) {
int i=0;
        try {

            author auth = new author();
            book bk = new book();

            int ID = 0;
            int phone_no = 0;
            String last = null;
            String middle = null;
            System.out.println(i++);
            // Step 1: Fetch author
            PreparedStatement ps1 = con.prepareStatement(
                    "SELECT * FROM auth WHERE first_Name = ?"
            );
            ps1.setString(1, author);

            ResultSet rss = ps1.executeQuery();

            if (rss.next()) {
                ID = rss.getInt("authId");
                phone_no = rss.getInt("phone_no");
                last = rss.getString("last_name");
                middle = rss.getString("middle_name");
            }else{
                ID=auth.getAuthId();
            }
            System.out.println(ID+" "+phone_no+" "+last+" "+middle);


            // Step 2: Insert only when there is not a author in author table
            if(ID == auth.getAuthId()) {

                PreparedStatement ps = con.prepareStatement(
                        "INSERT INTO auth VALUES(?,?,?,?,?)"
                );

                ps.setInt(1, ID);
                ps.setString(2, author);
                ps.setString(3, middle);
                ps.setString(4, last);
                ps.setInt(5, phone_no);

                int num = ps.executeUpdate();
                if (num > 0)
                    System.out.println("done here");

            }
            // Step 3: Insert into book
            PreparedStatement pss = con.prepareStatement(
                    "INSERT INTO book VALUES(?,?,?,?,?)"
            );

            System.out.println(i++);
            pss.setInt(1, bk.getIsbn());
            pss.setString(2, title);

            pss.setString(3, author);
            pss.setInt(4,0);
            pss.setInt(5, ID);

            pss.executeUpdate();

            return "completed";

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return "not done";
    }
    @Override
    public String updatePrice(String author,int price) {
        try{

            PreparedStatement ps = con.prepareStatement("UPDATE book SET price = ? WHERE author_name = ?");
            ps.setInt(1,price);
            ps.setString(2,author);
            int num = ps.executeUpdate();
            return "done";
        }
        catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return "not done";
    }
}
