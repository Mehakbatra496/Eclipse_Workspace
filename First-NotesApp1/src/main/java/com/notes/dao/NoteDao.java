package com.notes.dao;

import com.notes.model.Note;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

public class NoteDao {
    private String jdbcURL = "jdbc:mysql://localhost:3306/NotesDB";
    private String jdbcUsername = "mehak";
    private String jdbcPassword = "111";

    private static final String INSERT_NOTE_SQL = "INSERT INTO notes (title, content) VALUES (?, ?)";
    private static final String SELECT_ALL_NOTES = "SELECT * FROM notes";
    private static final String SEARCH_NOTES = "SELECT * FROM notes WHERE title LIKE ? OR content LIKE ?";

    public NoteDao() {}

    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public void saveNote(Note note) {
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_NOTE_SQL)) {
            preparedStatement.setString(1, note.getTitle());
            preparedStatement.setString(2, note.getContent());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Note> getAllNotes() {
        List<Note> notes = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_NOTES)) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next())
            {
                int id = rs.getInt("id");
                String title = rs.getString("title");
                String content = rs.getString("content");
                Timestamp createdAt = rs.getTimestamp("crated_at");
                notes.add(new Note(id, title, content, createdAt));
                
                System.out.println("Retrieved note: " + id + ", " + title + ", " + content + ", " + createdAt); // Debug statement

            }
        } catch (SQLException e)
        {
            System.err.println("SQL exception occurred: " + e.getMessage()); // Detailed error logging
            e.printStackTrace();
        }
        return notes;
    }
    
    public List<Note> searchNotes(String keyword) {
        List<Note> notes = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SEARCH_NOTES)) {
            String searchKeyword = "%" + keyword + "%";
            preparedStatement.setString(1, searchKeyword);
            preparedStatement.setString(2, searchKeyword);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String title = rs.getString("title");
                String content = rs.getString("content");
                Timestamp createdAt = rs.getTimestamp("created_at");
                notes.add(new Note(id, title, content, createdAt));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return notes;
    }
}
