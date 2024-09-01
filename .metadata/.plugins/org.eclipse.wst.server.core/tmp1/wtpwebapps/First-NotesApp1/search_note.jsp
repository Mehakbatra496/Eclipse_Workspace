<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Search Note</title>
</head>
<body>
    <h1>Search Note</h1>
    <form action="note" method="get">
        <label for="query">Search:</label>
        <input type="text" id="query" name="query" required>
        <input type="submit" value="Search">
    </form>
    <div id="results">
        <!-- Search results will be displayed here -->
    </div>
</body>
</html>
