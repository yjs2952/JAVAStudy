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
        <form id="loginForm" method="post">
            <div class="form-group row">
                <label class="col-form-label col-md-2" for="id">아이디</label>
                <div class="col-md-10">
                    <input class="form-control" type="text" id="id" name="id">
                </div>
            </div>
            <div class="form-group row">
                <label class="col-form-label col-md-2" for="pw">비밀번호</label>
                <div class="col-md-10">
                    <input class="form-control" type="text" id="pw" name="pw">
                </div>
            </div>
            <div class="row justify-content-center">
                <button type="submit" class="btn btn-primary">로그인</button>
            </div>
        </form>
    </div>
    <jsp:include page="${pageContext.request.contextPath}/WEB-INF/views/layouts/footer.jsp" flush="false"/>
</div>
</body>
</html>
