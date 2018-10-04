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
import java.util.ArrayList;
import java.util.List;

@WebServlet("/guestbook/list")
public class GuestbookListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        GuestbookDAO dao = new GuestBookDAOImpl();
        // DB 에서 목록을 읽어온다.
        List<Guestbook> list = dao.getList();
        /*list.add(new Guestbook("kim", "Hell o!"));
        list.add(new Guestbook("lee", "World!"));
        list.add(new Guestbook("kang", "!!!!"));*/

        // request scope - request 에 값을 저장하여 jsp 까지 값을 전달
        // 읽어온 결과를 전달하기 위해 request 에 값을 저장한다.
        req.setAttribute("guestbookList", list);
        req.setAttribute("guestbookSize", list.size());

        // jsp에 포워드 (forward) 한다. 포워딩은 url 은 변경되지 않고 jsp 에게 값을 전달
        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/list.jsp");
        dispatcher.forward(req, resp);

    }
}
