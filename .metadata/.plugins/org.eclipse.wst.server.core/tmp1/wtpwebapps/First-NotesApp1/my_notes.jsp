<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.notes.model.Note" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>My Notes</title>
</head>
<body>
    <h1>My Notes</h1>

   
   

    <%
        List<Note> notes = (List<Note>) request.getAttribute("notes");
        if (notes == null || notes.isEmpty()) {
            out.println("<p>No notes found. Please create a note first.</p>");
        } else {
            for (Note note : notes) {
                out.println("<div>");
                out.println("<h2>" + note.getTitle() + "</h2>");
                out.println("<p>" + note.getContent() + "</p>");
                out.println("<small>Created at: " + note.getCreatedAt() + "</small>");
                out.println("</div>");
            }
        }
    %>
</body>
</html>
