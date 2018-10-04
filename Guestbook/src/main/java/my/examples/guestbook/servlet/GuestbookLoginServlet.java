package my.examples.guestbook.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/guestbook/login")
public class GuestbookLoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/login.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 암호를 읽어들인다.
        String password = req.getParameter("pw");
        System.out.println(password);

        // 암호가 관리자 암호인지 확인
        if ("1234".equals(password)) {
            // 맞다면 session에 저장
            HttpSession session = req.getSession();
            session.setAttribute("admin", "true");
        }

        // 로그인 후에는 /guestbook/list redirect 한다.
        resp.sendRedirect("/guestbook/list");
    }
}
