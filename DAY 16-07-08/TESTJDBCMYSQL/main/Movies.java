package main.java;

import java.sql.*;

public class Movies {

    private Connection con;

    public void connect() throws SQLException {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_selenium", "root", "root");
    }

    public int insertMovie(String title, String director, String genre, int release_year) throws SQLException {
        String query = "INSERT INTO movies (title, director, genre, release_year) VALUES (?, ?, ?, ?)";
        PreparedStatement stmt = con.prepareStatement(query);
        stmt.setString(1, title);
        stmt.setString(2, director);
        stmt.setString(3, genre);
        stmt.setInt(4, release_year);
        return stmt.executeUpdate();
    }

    public int updateMovieTitle(String oldTitle, String director, String newTitle) throws SQLException {
        String query = "UPDATE movies SET title = ? WHERE title = ? AND director = ?";
        PreparedStatement stmt = con.prepareStatement(query);
        stmt.setString(1, newTitle);
        stmt.setString(2, oldTitle);
        stmt.setString(3, director);
        return stmt.executeUpdate();
    }

    public int deleteMovieByYear(int release_year) throws SQLException {
        String query = "DELETE FROM movies WHERE release_year = ?";
        PreparedStatement stmt = con.prepareStatement(query);
        stmt.setInt(1, release_year);
        return stmt.executeUpdate();
    }

    public void close() throws SQLException {
        if (con != null && !con.isClosed()) {
            con.close();
        }
    }
}