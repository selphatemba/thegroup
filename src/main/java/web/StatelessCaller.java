package web;

import bean.beanI.AdderRemoteI;
import bean.beanImpl.AdderRemote;

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
@WebServlet(urlPatterns = "/stateless")
public class StatelessCaller extends HttpServlet {

    @EJB
    AdderRemoteI adderRemoteI;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
adderRemoteI.add(10,20);
    }
}
