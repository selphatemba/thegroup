package web;

import bean.beanI.StatefulI;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by SELPHA on 8/3/2018.
 */
@WebServlet(urlPatterns = "/stateful")
public class StatefulCaller extends HttpServlet {
    @EJB
    StatefulI statefulI;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        statefulI.add();
        statefulI.add();
        statefulI.add();
    }
}
