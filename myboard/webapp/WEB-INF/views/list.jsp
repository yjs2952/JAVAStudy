<%@ page language="java" contentType="text/html; charset=EUC-KR"
         pageEncoding="EUC-KR" isELIgnored="false" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>list</title>
</head>
<body>
<h1>list</h1>
<br>

<c:forEach items="${boards}" var="board">
    <a href="/boards/getBoard?id=${board.id}">
            ${board.title}<br>
    </a>
</c:forEach>
<br>

<a href="/boards/writeForm">�۾���</a>
</body>
</html>

