package dbprogramming2;

import java.sql.*;
import java.util.*;

public class dbprogramming2 {
public static void main(String[] args) {

String url = "jdbc:mysql://localhost:3306/mydb2";
String username = "root";
String password = "Palm0890329110.";

try {
Class.forName("com.mysql.cj.jdbc.Driver");
System.out.println("Driver loaded");
Connection connection = DriverManager.getConnection(url, username, password);
System.out.println("Database Connected");
Statement statement = connection.createStatement();
} catch (ClassNotFoundException e) {
throw new RuntimeException(e);
} catch (SQLException e) {
throw new RuntimeException(e);
}
}

}