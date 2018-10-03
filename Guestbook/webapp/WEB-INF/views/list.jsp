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
        <div class="buttonTag fa-pull-right">
            <a href="${pageContext.request.contextPath}/guestbook/write">
                <button class="btn btn-sm btn-success">글 쓰기</button>
            </a>
        </div>
        <div class="contentList">
            <table class="table table-striped table-hover">
                <colgroup>
                    <col style="width: 10%;">
                    <col style="width: 20%;">
                    <col style="width: 50%;">
                    <col style="width: 20%;">
                </colgroup>
                <thead>
                <tr>
                    <th class="text-center">번호</th>
                    <th class="text-center">성명</th>
                    <th class="text-center">제목</th>
                    <th class="text-center">날짜</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td class="text-center">1</td>
                    <td class="text-center">홍길동</td>
                    <td>축지법 쓰는 법</td>
                    <td class="text-center">2018-10-03</td>
                </tr>
                <tr>
                    <td class="text-center">2</td>
                    <td class="text-center">임꺽정</td>
                    <td>의적의 길이란....</td>
                    <td class="text-center">2018-10-03</td>
                </tr>
                <tr>
                    <td class="text-center">3</td>
                    <td class="text-center">이순신</td>
                    <td>내 죽음을 적에게 알리지 마라</td>
                    <td class="text-center">2018-10-03</td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>
    <jsp:include page="${pageContext.servletContext.contextPath}/WEB-INF/views/layouts/footer.jsp" flush="false"/>
</div>
</body>
</html>
