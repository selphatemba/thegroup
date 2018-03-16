package bean.beanI;


import javax.ejb.Local;
import javax.ejb.Remote;

/**
 * Created by SELPHA on 8/3/2018.
 */
@Local
public interface AdderRemoteI {
    int add(int a,int b);
}
