package com.java8.functionalinterface.supplier;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.function.Supplier;

public class SupplierDemo {

    /*
     * ✅ Supplier Interface (java.util.function.Supplier<T>)
     * --------------------------------------------------------
     * ➤ It is a functional interface introduced in Java 8.
     * ➤ Represents a supplier of results — it does **not take any input**.
     * ➤ Abstract method: T get()
     * ➤ It is mainly used for:
     *      - Lazy object creation (e.g., DB connection, date, config)
     *      - Random number generation
     *      - Providing default values
     * ➤ It returns a result each time `get()` is called.
     */

    public static void main(String[] args) {

        // ✅ Define a Supplier to return a DB Connection
        Supplier<Connection> getDB = () -> {
            Connection connection = null;
            try {
                // Attempt to establish a connection to MySQL database
                connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306", // URL
                        "root",                         // Username
                        "root"                          // Password
                );
            } catch (SQLException e) {
                // Handle SQL exception
                System.out.println("Error: " + e.getMessage());
            } finally {
                // Return the connection (might be null if failed)
                return connection;
            }
        };

        // ✅ Use the Supplier to get a DB connection
        Connection con = getDB.get();
        System.out.println("Connection object: " + con);
    }
}
