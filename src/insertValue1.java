import java.sql.*;
import java.util.Scanner;

public class insertValue1 {
    Connection con;
    insertValue1(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/google_play_game","root","");
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public void insert(String name,int rollNo,String Add)
    {
        String q="insert  into student value(?,?,?)";
        try {
            PreparedStatement stmt = con.prepareStatement(q);
            stmt.setString(1,name);
            stmt.setInt(2,rollNo);
            stmt.setString(3,Add);
            stmt.executeUpdate();
            System.out.println("insertion successful");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
class main1{
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        insertValue1 obj=new insertValue1();
        System.out.println("Enter student name:  ");
        String name=sca.next();

        System.out.println("Enter student roll.no: ");
        int rool_no=sca.nextInt();

        System.out.println("Enter student roll Address: ");
        String address=sca.next();
        obj.insert(name,rool_no,address);
    }
}