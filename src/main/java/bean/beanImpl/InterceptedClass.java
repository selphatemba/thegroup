package bean.beanImpl;


import bean.beanI.English1;

import javax.enterprise.context.RequestScoped;
import javax.interceptor.Interceptors;

/**
 * Created by SELPHA on 7/3/2018.
 */
@RequestScoped
public class InterceptedClass {
    @English1
    public void printSomething(){
        System.out.println("hey");
    }
}
