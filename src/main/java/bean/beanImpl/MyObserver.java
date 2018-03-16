package bean.beanImpl;

import bean.beanI.GreetingI;
import bean.beanI.Language;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

import static bean.beanI.Language.LangChoice.KISWAHILI;

/**
 * Created by SELPHA on 5/3/2018.
 */
@RequestScoped
public class MyObserver {
    @Inject
    @Language(value = KISWAHILI)
    GreetingI greetingI;
    public void sendWelcomeMessage(@Observes RegistrationEvent e){
            System.out.println(greetingI.sayHello()+e.getName()+e.getId());
    }
}
