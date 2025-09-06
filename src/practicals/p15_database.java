package practicals;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class p15_database{
        // MySQL database URL
        static final String DB_URL = "jdbc:mysql://localhost:3306/jdbc?useSSL=false&serverTimezone=UTC";

        // Database credentials
        static final String USER = "root";
        static final String PASS = "02032002";

        public static void main(String[] args) {
            Connection conn = null;
            Statement stmt = null;
            try {
                // Open a connection
                System.out.println("Connecting to database...");
                conn = DriverManager.getConnection(DB_URL, USER, PASS);

                // Delete previous entry
                System.out.println("Deleting previous entry...");
                stmt = conn.createStatement();
                String deleteQuery = "DELETE FROM dreamer WHERE id = 041";
                stmt.executeUpdate(deleteQuery);

                // Execute insert query
                System.out.println("Inserting new record into the table...");
                String insertQuery = "INSERT INTO dreamer (id, name, age) VALUES (041, 'Akash Singh', 21)";
                stmt.executeUpdate(insertQuery);

                // Get updated age from user
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter the updated age:");
                int updatedAge = scanner.nextInt();

                // Execute update query
                String updateQuery = "UPDATE dreamer SET age = " + updatedAge + " WHERE id = 041";
                System.out.println("Updating record in the table...");
                stmt.executeUpdate(updateQuery);

                // Display updated data
                System.out.println("Displaying updated records...");
                String selectQuery = "SELECT * FROM dreamer WHERE id = 041";
                ResultSet rs = stmt.executeQuery(selectQuery);

                // Process the result set
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    int age = rs.getInt("age");

                    // Display the details
                    System.out.println("ID: " + id);
                    System.out.println("Name: " + name);
                    System.out.println("Age: " + age);
                }

                // Clean-up environment
                rs.close();
                stmt.close();
                conn.close();
                scanner.close();
            } catch (SQLException se) {
                // Handle errors for JDBC
                se.printStackTrace();
            } finally {
                // Finally block used to close resources
                try {
                    if (stmt != null)
                        stmt.close();
                } catch (SQLException se2) {
                } // Nothing we can do
                try {
                    if (conn != null)
                        conn.close();
                } catch (SQLException se) {
                    se.printStackTrace();
                }
            }
            System.out.println("Goodbye!");
        }
    }

