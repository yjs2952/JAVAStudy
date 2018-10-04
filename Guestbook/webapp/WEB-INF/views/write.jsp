<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<jsp:include page="${pageContext.request.contextPath}/WEB-INF/views/layouts/head.jsp" flush="false"/>
<body>
<div class="container">
    <jsp:include page="${pageContext.request.contextPath}/WEB-INF/views/layouts/header.jsp" flush="false"/>
    <div class="content">
        <h2>글 쓰기</h2>
        <form id="boardForm" method="post">
            <div class="form-group row">
                <label for="name" class="col-lg-1 col-md-6 col-form-label">성명</label>
                <div class="col-lg-11 col-md-12">
                    <input type="text" class="form-control" id="name" name="name" placeholder="성명.....">
                </div>
            </div>
            <%--<div class="form-group row">
                <label for="title" class="col-lg-1 col-md-6 col-form-label">제목</label>
                <div class="col-lg-11 col-md-12">
                    <input type="text" class="form-control" id="title" name="title" placeholder="제목.....">
                </div>
            </div>--%>
            <div class="form-group row">
                <label for="content" class="col-lg-1 col-md-6 col-form-label">내용</label>
                <div class="col-lg-11 col-md-12">
                    <textarea id="content" class="form-control" name="content" placeholder="내용....."></textarea>
                </div>
            </div>
            <div class="form-group row justify-content-center">
                <button type="submit" class="btn btn-primary btn-sm">확인</button>
                <a class="btn btn-info btn-sm" href="/guestbook/list" role="button">취소</a>
            </div>

        </form>
    </div>
    <jsp:include page="${pageContext.request.contextPath}/WEB-INF/views/layouts/footer.jsp" flush="false"/>
</div>
</body>
</html>
