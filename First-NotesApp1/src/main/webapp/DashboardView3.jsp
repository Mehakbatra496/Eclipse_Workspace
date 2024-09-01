<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.notes.model.Note" %>
<%@ page import="com.notes.dao.NoteDao" %>
<!DOCTYPE html>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Notes Application</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
        }
        .container {
            width: 80%;
            margin: auto;
            overflow: hidden;
            display: flex;
            flex-direction: row;
            
            gap:50px;
        }
        
        
       .left
       {
            display: flex;
            flex-direction: column;
        }
        
        header {
            background: #333;
            color: #fff;
            padding-top: 30px;
            min-height: 70px;
            border-bottom: #0779e4 3px solid;
        }
        header a {
            color: #fff;
            text-decoration: none;
            text-transform: uppercase;
            font-size: 16px;
        }
        header ul {
            padding: 0;
            list-style: none;
        }
        header li {
            float: left;
            display: inline;
            padding: 0 20px 0 20px;
        }
        .content {
            padding: 20px;
            background: #fff;
            border-radius: 10px;
            margin-top: 20px;
        }
        form {
            margin: 20px 0;
        }
        label {
            display: block;
            margin: 10px 0 5px;
        }
        input[type="text"], textarea {
            width: 100%;
            padding: 10px;
            margin: 5px 0 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        input[type="submit"] {
            background: #0779e4;
            color: #fff;
            border: 0;
            padding: 10px 15px;
            border-radius: 5px;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background: #0056a3;
        }
        .section-title {
            font-size: 1.5em;
            color: #333;
            border-bottom: 2px solid #0779e4;
            padding-bottom: 10px;
            margin-bottom: 20px;
        }
        
        section
        {
        
        width:90%;
        }
        
        .large
        {
        	width:300px;
        }
    </style>
</head>
<body>
    <header>
        <div class="container">
            <h1>Notes Application</h1>
            <ul>
                <li><a href="#create-note">Create Note</a></li>
                <li><a href="#search-note">Search Note</a></li>
                <li><a href="#my-notes">My Notes</a></li>
            </ul>
        </div>
    </header>

    <div class="container">
    
       <section>
	       <div id="search-note" class="content">
	            <h2 class="section-title">Search Note</h2>
	            <form action="note" method="get">
	                <input type="text" id="search-query" name="query" placeholder="Enter keyword or title" required>
	                <input type="submit" value="Search">
	            </form>
	        </div>
        
        <div id="my-notes" class="content" >
            <h2 class="section-title">My Notes</h2>
            <!-- This section would be dynamically filled with notes from the server -->
             <%
        // Initialize NoteDao
        NoteDao noteDao = new NoteDao();
        List<Note> notes = noteDao.getAllNotes();
        //if (notes.isEmpty()) {
          //  out.println("<p>No notes found. Please create a note first.</p>");
        //} 
        //else {
            for (Note note : notes) {
                out.println("<div>");
                out.println("<h2>" + note.getTitle() + "</h2>");
                out.println("<p>" + note.getContent() + "</p>");
                out.println("<small>Created at: " + note.getCreatedAt() + "</small>");
                out.println("</div>");
            }
        //}
    %>
            
            
            
        </div>
    </section>
    
        <section id="create-note " class="content large"  >
            <h2 class="section-title">Create Note</h2>
            <form action="notes" method="post">
                <label for="note-title">Title</label>
                <input type="text" id="note-title" name="title" required>
                <label for="note-content">Content</label>
                <textarea id="note-content" name="content" rows="10" required></textarea>
                <input type="submit" value="Create Note">
            </form>
        </section>
        
       

     </div>
		
</body>
</html>