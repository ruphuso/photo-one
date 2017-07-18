import entity.User;
import hibernateFactory.Factory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet (name = "ServletMain")
public class ServletMain extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        process(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        process(req, resp);
    }

    private void process(HttpServletRequest request, HttpServletResponse resp) throws IOException {
        String login = request.getParameter("name");
        String name = request.getParameter("login");
        String password = request.getParameter("password");
        User user = new User();
        user.setName(name);
        user.setLogin(login);
        user.setPassword(password);
        try {
            Factory.getInstance().getUserDAO().addUser(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("name: " + name + "; login: " + login + "; password: " + password);

    }
}