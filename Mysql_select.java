package com.mysql;

import java.sql.*;

public class Mysql_select {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "pandu@142";

        try {
            // Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to DB
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Successfully connected to MySQL database test");

            // ------------------- READ EXISTING RECORDS -------------------
            String selectQuery = "SELECT id, coffee_name, price FROM coffee";
            PreparedStatement psSelect = con.prepareStatement(selectQuery);
            ResultSet rs = psSelect.executeQuery();

            System.out.println("\nExisting Coffee Records:");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                        rs.getString("coffee_name") + " | " +
                        rs.getInt("price"));
            }

            rs.close();
            psSelect.close();

            // ------------------- INSERT NEW RECORD -------------------
            String insertQuery = "INSERT INTO coffee (coffee_name, price) VALUES (?, ?)";
            PreparedStatement psInsert = con.prepareStatement(insertQuery);

            psInsert.setString(1, "Danu");
            psInsert.setInt(2, 500);

            psInsert.executeUpdate();
            System.out.println("\nNew Coffee Record Inserted Successfully!");

            psInsert.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}