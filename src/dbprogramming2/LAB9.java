package dbprogramming2;

import java.sql.*;
import java.util.*;


public class LAB9 {
public static void main(String[] args) {
String url = "jdbc:mysql://localhost:3306/mydb2";
String username = "root";
String password = "Palm0890329110.";
try {
Class.forName("com.mysql.cj.jdbc.Driver");
Connection connection = DriverManager.getConnection(url, username, password);
Statement statement = connection.createStatement();
String sql = "insert into student()" + "values('64130500058','Patsakorn,'Jakklom','patsakorn.jakk@kmutt.ac.th','IT')";
statement.executeUpdate(sql);

} catch (ClassNotFoundException e) {
throw new RuntimeException(e);
} catch (SQLException e) {
throw new RuntimeException(e);
}

}
}