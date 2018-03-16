package web;


import bean.beanImpl.InterceptedClass;


import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by SELPHA on 7/3/2018.
 */
@WebServlet(urlPatterns = "/intercepted")
public class Intercepted extends HttpServlet {
    @Inject
    private InterceptedClass interceptedClass;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       interceptedClass.printSomething();

    }
}
