package my.examples.guestbook.servlet;

import my.examples.guestbook.dao.GuestBookDAOImpl;
import my.examples.guestbook.dao.GuestbookDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/guestbook/write")
public class GuestbookWriteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/views/write.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        Guestbook guestbook = new Guestbook();
        guestbook.setName(req.getParameter("name"));
        guestbook.setContent(req.getParameter("content"));

        GuestbookDAO dao = new GuestBookDAOImpl();
        int result = dao.addGuestbook(guestbook);
        System.out.println("addGuestbook : " + result);
        //System.out.println("name = " + name + ", title = " + title + ", content = " + content);

        resp.sendRedirect("/guestbook/list");
    }
}
