package bean.beanImpl;

import bean.beanI.DecoratorI;

import javax.annotation.Priority;
import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.inject.Inject;
import javax.interceptor.Interceptor;

/**
 * Created by SELPHA on 8/3/2018.
 */
@Decorator
@Priority(Interceptor.Priority.APPLICATION)
public class DecoratorImpl implements DecoratorI {
    @Inject
    @Delegate
    DecoratorI decoratorI;

    public void welcomeMessage(String message) {
        decoratorI.welcomeMessage(message);

    }
}
