<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!doctype html>
<html lang="en">
<jsp:include page="WEB-INF/views/layouts/head.jsp" flush="false"/>
<body>
<div class="container">
    <jsp:include page="WEB-INF/views/layouts/header.jsp" flush="false"/>
    <div class="content">
        <div class="jumbotron">
            <h1 class="display-4">YJS의 방문록</h1>
            <p class="lead">This is a simple hero unit, a simple jumbotron-style component for calling extra attention
                to featured content or information.</p>
            <hr class="my-4">
            <p>It uses utility classes for typography and spacing to space content out within the larger container.</p>
            <a class="btn btn-primary btn-lg" href="/guestbook/list" role="button">Learn more</a>
        </div>
    </div>
    <jsp:include page="WEB-INF/views/layouts/footer.jsp" flush="false"/>
</div>
</body>
</html>