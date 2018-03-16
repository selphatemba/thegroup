package web;

import bean.beanI.GreetingI;
import bean.beanI.Language;
import bean.beanImpl.RegistrationEvent;

import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import static bean.beanI.Language.LangChoice.BUKUSU;
import static bean.beanI.Language.LangChoice.ENGLISH;
import static bean.beanI.Language.LangChoice.KISWAHILI;

/**
 * Created by SELPHA on 21/2/2018.
 */
@WebServlet(urlPatterns = "/greeting1")
public class GreetingServelet1 extends HttpServlet {
    @Inject
    @Language(BUKUSU)
    private GreetingI bukusuGreeting;
    @Inject
    @Language(value=KISWAHILI)
    private  GreetingI swahiligreeting;
    @Inject
    @Language(value=ENGLISH)
    private  GreetingI englishgreeting;
    @Inject
    Event<RegistrationEvent> e;



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out=resp.getWriter();
        RegistrationEvent registrationEvent=new RegistrationEvent();
        registrationEvent.setName("Tobby");
        registrationEvent.setId(34);
        out.print(bukusuGreeting.sayHello());
        e.fire(registrationEvent);

    }
}
