package web;

import bean.jmsqueue.MdbMyListener;
import bean.jmsqueue.MyReceiver;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by SELPHA on 8/3/2018.
 */
@WebServlet(urlPatterns = "/receiver")
public class Receiver extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        MdbMyListener listener=new MdbMyListener();
    }
}
