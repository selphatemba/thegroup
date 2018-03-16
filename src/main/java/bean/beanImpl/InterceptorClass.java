package bean.beanImpl;



import bean.beanI.English1;

import javax.annotation.Priority;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;


/**
 * Created by SELPHA on 7/3/2018.
 */

@Interceptor
@English1
@Priority(Interceptor.Priority.APPLICATION)
class InterceptorClass {
    @AroundInvoke
    public Object sayHello1(InvocationContext invocationContext){
        System.out.println("i intercepted you.......");
        try {
            invocationContext.proceed();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Object();
    }
}
