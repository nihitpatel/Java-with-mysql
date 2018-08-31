
import java.sql.*;

public class connection {
    public static void main(String args[]) throws Exception{
        
        Class.forName("");
        Connection con = DriverManager.getConnection("");
        Statement smt = con.createStatement();
        String query = "insert into data value(101,\"Roger\",9999999999";
        smt.executeQuery(query);
        System.out.println("Row Successfully Inserted into the table");
        
    }
}
