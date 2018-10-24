<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" isELIgnored="false"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    name : ${requestScope.board.name} <br>
    title : ${requestScope.board.title} <br>
    content : ${requestScope.board.content} <br>
<a href="/boards/deleteBoard?id=${requestScope.board.id}">
    <button type="button">삭제 ㅋ</button>
</a>
    <a href="/boards/updateForm?id=${requestScope.board.id}">
        <button type="button">수정 ㅋ</button>
    </a>

</body>
</html>
