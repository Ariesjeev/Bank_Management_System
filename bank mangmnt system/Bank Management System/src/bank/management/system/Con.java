package bank.management.system;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.Statement;
import java.sql.*;

public class Con {
    Connection connection;
    Statement statement;
    public Con(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","Babblu@123");
//            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/?user=root");
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
