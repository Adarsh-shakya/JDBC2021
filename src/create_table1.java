import java.sql.*;
class create_table1{
    public static void main(String[] args) {
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/google_play_game","root","");
        //create table
        String q="create table student (name varchar(20),roll_no int,address varchar(20))";
        Statement stmt=conn.createStatement();
        stmt.executeUpdate(q);
        System.out.println("create table successfully....");
    }
    catch (Exception e){
        System.out.println(e);
    }
    }
}