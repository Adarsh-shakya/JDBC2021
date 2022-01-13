import java.sql.*;


public class insertValue {
    Connection con;
     insertValue(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/google_play_game","root","");
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public void insert()
    {
        String q="insert  into student value('Adarsh',56,'Etah')";
        try {
            Statement stmt = con.createStatement();
            stmt.executeUpdate(q);
            System.out.println("insertion successful");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
class main{
    public static void main(String[] args) {
        insertValue obj=new insertValue();
        obj.insert();
    }
}
