package jdbc_practice.com.example.jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class DatabaseInitializer {
    static void main() {
        Properties prop = new Properties();
        try(FileInputStream fis = new FileInputStream("src/jdbc_practice/resource/db.properties")) {
            prop.load(fis);
        }catch (IOException io){
            IO.println(io.getMessage());
        }

        String url = prop.getProperty("db.url");
        String username = prop.getProperty("db.username");
        String password = prop.getProperty("db.password");

        try(Connection conn = DriverManager.getConnection(url,username,password)){
            IO.println("✅ Connected to MySQL 9.5 successfully.");

            createUsersTable(conn);
            createProductsTable(conn);
            createOrdersTable(conn);
            createPaymentsTable(conn);
            createReviewsTable(conn);

            IO.println("🎯 Database initialization complete.");


        }catch (SQLException e){
            IO.println(e.getMessage());
        }
    }

    private static void executeDDLQuery(Connection connection, String query, String table) throws SQLException{
        try(Statement statement = connection.createStatement()){
            statement.execute(query);
            IO.println("✅ Table checked/created: " + table);
        }
    }

    private static void createUsersTable(Connection conn) throws SQLException {
        String sql = """
            CREATE TABLE IF NOT EXISTS users (
                user_id INT AUTO_INCREMENT PRIMARY KEY,
                full_name VARCHAR(100) NOT NULL,
                email VARCHAR(100) UNIQUE NOT NULL,
                phone VARCHAR(15),
                created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
            );
            """;
        executeDDLQuery(conn, sql, "users");
    }

    private static void createProductsTable(Connection conn) throws SQLException {
        String sql = """
            CREATE TABLE IF NOT EXISTS products (
                product_id INT AUTO_INCREMENT PRIMARY KEY,
                name VARCHAR(150) NOT NULL,
                category VARCHAR(50),
                price DECIMAL(10, 2),
                stock INT DEFAULT 0,
                added_on TIMESTAMP DEFAULT CURRENT_TIMESTAMP
            );
            """;
        executeDDLQuery(conn, sql, "products");
    }

    private static void createOrdersTable(Connection conn) throws SQLException {
        String sql = """
            CREATE TABLE IF NOT EXISTS orders (
                order_id INT AUTO_INCREMENT PRIMARY KEY,
                user_id INT,
                total_amount DECIMAL(10,2),
                order_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                status VARCHAR(20) DEFAULT 'Processing',
                FOREIGN KEY (user_id) REFERENCES users(user_id)
            );
            """;
        executeDDLQuery(conn, sql, "orders");
    }

    private static void createPaymentsTable(Connection conn) throws SQLException {
        String sql = """
            CREATE TABLE IF NOT EXISTS payments (
                payment_id INT AUTO_INCREMENT PRIMARY KEY,
                order_id INT,
                payment_method VARCHAR(50),
                amount DECIMAL(10,2),
                payment_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                payment_status VARCHAR(20) DEFAULT 'Completed',
                FOREIGN KEY (order_id) REFERENCES orders(order_id)
            );
            """;
        executeDDLQuery(conn, sql, "payments");
    }

    private static void createReviewsTable(Connection conn) throws SQLException {
        String sql = """
            CREATE TABLE IF NOT EXISTS reviews (
                review_id INT AUTO_INCREMENT PRIMARY KEY,
                user_id INT,
                product_id INT,
                rating INT CHECK (rating BETWEEN 1 AND 5),
                review_text TEXT,
                created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                FOREIGN KEY (user_id) REFERENCES users(user_id),
                FOREIGN KEY (product_id) REFERENCES products(product_id)
            );
            """;
        executeDDLQuery(conn, sql, "reviews");
    }


}
