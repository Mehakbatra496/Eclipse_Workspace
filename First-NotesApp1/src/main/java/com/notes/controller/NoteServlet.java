
package com.notes.controller;

import com.notes.dao.NoteDao;
import com.notes.model.Note;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/notes")
public class NoteServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private NoteDao noteDao;

    public void init() {
        noteDao = new NoteDao();
    }

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Note> notes = noteDao.getAllNotes();
        request.setAttribute("notes", notes);
        request.getRequestDispatcher("my_notes.jsp").forward(request, response);
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String keyword = request.getParameter("keyword");
        List<Note> notes = noteDao.searchNotes(keyword);
        request.setAttribute("notes", notes);
        request.getRequestDispatcher("my_notes.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String title = request.getParameter("title");
        String content = request.getParameter("content");
 
        Note note = new Note();
        note.setTitle(title);
        note.setContent(content);
        noteDao.saveNote(note);

        response.sendRedirect("my_notes.jsp");
    }
}