package my.examples.guestbook.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/guestbook/list")
public class GuestbookListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // DB 에서 목록을 읽어온다.

        // 읽어온 결과를 JSP에게 전달하기 위해 Request에 값을 저장한다.

        // JSP에 포워딩 (forward) 한다. 포워딩은 URL 변경되지 않고 JSP 에게 값을 전달
        RequestDispatcher dispatcher
                = req.getRequestDispatcher("/WEB-INF/views/list.jsp");
        dispatcher.forward(req, resp);
    }
}
