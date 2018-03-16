package bean.beanImpl;

import bean.beanI.GreetingI;
import bean.beanI.Language;

import javax.enterprise.context.RequestScoped;

import static bean.beanI.Language.LangChoice.BUKUSU;

/**
 * Created by SELPHA on 21/2/2018.
 */
@RequestScoped
@Language(BUKUSU)
public class BukusuGreeting1 implements GreetingI {
    public String sayHello() {
        return "mlembe mno mno";

    }
}
