<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <%-- 부트스트랩 불러오기 전에 Jquery를 먼저 불러야 된다. --%>
    <script src="${pageContext.servletContext.contextPath}/webjars/jquery/3.3.1/dist/jquery.min.js"></script>
    <script src="${pageContext.servletContext.contextPath}/webjars/bootstrap/4.1.3/dist/js/bootstrap.min.js"></script>
    <link rel="stylesheet"
          href="${pageContext.servletContext.contextPath}/webjars/bootstrap/4.1.3/dist/css/bootstrap.min.css">
    <link rel="stylesheet"
          href="${pageContext.servletContext.contextPath}/webjars/font-awesome/5.3.1/css/fontawesome.css">

    <style type="text/css">
        header {
            padding-top: 10px;
        }

        header > nav {
            border-radius: .3rem;
        }

        div.content {
            padding-top: 10px;
        }

        #boardForm {
            margin: 3%;
        }

        .buttonTag {
            padding: 0 16px 10px 16px;
        }

    </style>

    <script type="text/javascript">
        $(function () {
            $('.carousel').carousel()
        })
    </script>
</head>