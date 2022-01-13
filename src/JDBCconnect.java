import java.sql.*;
public class JDBCconnect {
    Connection con;
    JDBCconnect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/google_play_game","root","");
            System.out.println("connection success");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        JDBCconnect a=new JDBCconnect();
    }
}
