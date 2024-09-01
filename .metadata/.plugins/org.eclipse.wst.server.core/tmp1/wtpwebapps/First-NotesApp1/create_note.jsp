<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Create Note</title>
</head>
<body>
    <h1>Create Note</h1>
    <form action="notes" method="post">
        <label for="title">Title:</label>
        <input type="text" id="title" name="title" required><br><br>
        <label for="content">Content:</label>
        <textarea id="content" name="content" rows="10" cols="30" required></textarea><br><br>
        <input type="submit" value="Create Note">
    </form>
</body>
</html>
