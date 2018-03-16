package bean.beanI;

import javax.inject.Qualifier;
import javax.interceptor.InterceptorBinding;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by SELPHA on 27/2/2018.
 */

@Qualifier
@Retention(RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE, ElementType.METHOD, ElementType.PARAMETER})
public @interface Language {
    LangChoice value();

     enum LangChoice{
        ENGLISH,KISWAHILI,BUKUSU
    }
}
