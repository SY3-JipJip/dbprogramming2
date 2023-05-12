package dbprogramming2;

import java.sql.*;
import java.util.*;

public class LAB8 {
public static void main(String[] args) {
String url = "jdbc:mysql://localhost:3306/mydb2";
String username = "root";
String password = "Palm0890329110.";
try {
Class.forName("com.mysql.cj.jdbc.Driver");
Connection connection = DriverManager.getConnection(url, username, password);
Statement statement = connection.createStatement();
String sql = "select * from student";
ResultSet result = statement.executeQuery(sql);

while (result.next()) {
System.out.println(result.getString(1) + " "
+ result.getString(2) + " "
+ result.getString(3) + " "
+ result.getString(4) + " "
+ result.getString(5));
}
} catch (ClassNotFoundException e) {
throw new RuntimeException(e);
} catch (SQLException e) {
throw new RuntimeException(e);
}

}
}