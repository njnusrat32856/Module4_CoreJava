import java.sql.*;

public class Main {
    public static void main(String[] args) {


        String url = "jdbc:postgresql://40.40.11.118:5433/jdbc-db";
        String userName = "postgres";
        String password = "postgres";
        String sqlQuery = "SELECT * FROM Employee WHERE EMPLOYEEID=3";


        try {
            Connection connection = DriverManager.getConnection(url,userName, password);
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sqlQuery);
            rs.next();

            String firstName = rs.getString("firstName");
            String lastName = rs.getString("lastName");

            System.out.println("First Name: " + firstName);
            System.out.println("Last Name: " + lastName);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}