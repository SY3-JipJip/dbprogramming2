package dbprogramming2;

import java.sql.*;
public class LAB12 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb2";
        String username = "root";
        String password = "Palm0890329110.";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);

            String sql = "INSERT INTO student VALUES (?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,"64130500058");
            preparedStatement.setString(2,"Patsakorn");
            preparedStatement.setString(3,"Jakklom");
            preparedStatement.setString(4,"Patsakorn.jakk@kmutt.ac.th");
            preparedStatement.setString(5,"IT");
            preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}