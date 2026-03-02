package org.example;

import java.sql.*;
import java.util.Scanner;

public class Myconnection {

    public static void main(String[] args) {

        try {
            // Load Driver (Optional in new versions)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create Connection
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/department",
                    "root",
                    "1234"
            );


            ///  INSERT INTO TABLE
//        PreparedStatement ps = con.prepareStatement("Insert into dept Values (?,?,?)");
//        ps.setString(1,"70");
//        ps.setString(2,"Sales");
//        ps.setString(3,"delhi");
//            int row = ps.executeUpdate();
//            if(row>0){
//                System.out.println("yes");
//            }

            ///  deldete from the table
//        PreparedStatement ps= con.prepareStatement("Delete from dept where DNAME = ?");
//        ps.setString(1,"sales");
//        int row= ps.executeUpdate();
//        if(row>0){
//            System.out.println("executed");
//        }
//        else{
//            System.out.println("not");
//        }

        ///  update in table
            PreparedStatement RS= con.prepareStatement("UPDATE dept \n SET DEPTNO = 100 WHERE DEPTNO =?");
            RS.setString(1,"40");
            int row1= RS.executeUpdate();
            if(row1>0){
                System.out.println("executed");
            }
            else{
                System.out.println("not");
            }







/// PREPARED STATEMENT IN MYSQL
//            PreparedStatement ps = con.prepareStatement("select * from dept where DEPTNO=? and Dname =?");
//            ps.setString(1,"30");
//            ps.setString(2,"SALES");
//
//            ResultSet rs = ps.executeQuery();
//            if(rs.next()){
//                System.out.println(rs.getString("DEPTNO")+"  "+rs.getString("DNAME")+"  "+rs.getString(3));
//            }
//
//

          ///  STATEMENT IN  MYSQL
//            Scanner input = new Scanner(System.in);
//            System.out.println(" give dept id for login : ");
//            String id = input.next();
//            Statement st = con.createStatement();
//            ResultSet rs = st.executeQuery("select * from dept where DEPTNO="+id);
//            if(rs.next()){
//                System.out.println(rs.getString("Dname"));
//            }
//            else{
//                System.out.println("wrong ");
//            }



            ///  RS. NEXT WILL HOLD ALL VALUE  AND WE ARE ITERATING ON IT
//           while( rs.next()){
//            System.out.println(rs.getString(2));}

            System.out.println("Connected Successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

