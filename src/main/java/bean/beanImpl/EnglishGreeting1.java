package bean.beanImpl;

import bean.beanI.GreetingI;
import bean.beanI.Language;

import javax.enterprise.context.RequestScoped;
import javax.interceptor.InterceptorBinding;

import static bean.beanI.Language.LangChoice.ENGLISH;

/**
 * Created by SELPHA on 21/2/2018.
 */
@RequestScoped
@Language(ENGLISH)
public class EnglishGreeting1 implements GreetingI {
    public String sayHello() {
        return "Hello";
    }
}
