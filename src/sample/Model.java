package sample;

import com.sun.media.sound.SimpleSoundbank;

import java.util.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.sql.*;


public class Model implements IModel{

    public Model() {

    }

    @Override
    public void Create(String userName, String password, String firstName, String lastName, Date bithday, String city) {

    }

    @Override
    public User Read(String userName) {
        return null;
    }

    @Override
    public void Update(String userName, String password, String firstName, String lastName, Date bithday, String city) {

    }




    /**
     * Connect to the Users.db database
     *
     * @return the Connection object
     */
    private Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:Users.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
            System.out.println("connect");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    @Override
    /**
     * Delete function get the strings username and password.
     * It checks if the username exists, and also if the password is match.
     * if user was deleted, success alert is shown. if not, the user get error alert.
     */
    public void Delete(String userName, String Password) {

            //String sql = "DELETE FROM Users WHERE user_name =" + userName + " AND password =" + Password;
            String sql = "DELETE FROM Users WHERE user_name = liron";

            try (Connection conn = this.connect();
                 PreparedStatement pstmt = conn.prepareStatement(sql)) {

                // set the username param
               // pstmt.setString(1, userName);
                // set the password param
                //pstmt.setString(2, Password);
                // execute the delete statement

                System.out.print(sql);
                pstmt.executeUpdate();

            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }


    }
