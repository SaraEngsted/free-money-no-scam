package com.example.freemoneynoscam.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class connectToDB {

    static Statement stmt;
    static Connection con;

    public static void connectToDB() {
        System.out.println("Connecting to DB");
        try {
            //Define URL of database server for database named test_hotel
            //on the localhost with the default port number 3306.
            String url = "jdbc:mysql://localhost:3306/free_money";

            //Get a connection to the database for a user named root with password admin
            //con = DriverManager.getConnection(url, "root", "22emsa44");

            //Display the URL and connection information

        } catch (Exception e) {
            e.printStackTrace();
        }//end catch
    }

    public void insertData(String email) {

        String insertSQL = "INSERT INTO email_table"
                + "(`email`) "
                + "VALUES('" + email + "')";
        try {

            String url = "jdbc:mysql://localhost:3306/free_money";

            //Get a connection to the database for a user named root with password admin
            con = DriverManager.getConnection(url, "root", "22emsa44");

            //Get another statement object initialized as shown.
            stmt = con.createStatement();
            stmt.executeUpdate(insertSQL);
        } catch (Exception e) {
            e.printStackTrace();
        }//end catch

    }

}
