<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="ISO-8859-1">
        <title>The Code</title>
    </head>

    <body>
        <form method="POST" action="/login">
            <label>What is the Code?</label>
            <p><c:out value="${error}"/></p>
            <input type="text" name="code">
            <button>Try Code</button>
        </form>
    </body>

    </html>