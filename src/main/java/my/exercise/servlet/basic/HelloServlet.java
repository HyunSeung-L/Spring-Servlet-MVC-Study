package my.exercise.servlet.basic;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "helloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.service(req, resp);
        String username = req.getParameter("username");

        System.out.println(username);

        resp.setContentType("text/plain");
        resp.setCharacterEncoding("utf-8");
        resp.getWriter().write("hello" + username);
    }
}
