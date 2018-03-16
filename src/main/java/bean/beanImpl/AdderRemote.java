package bean.beanImpl;


import bean.beanI.AdderRemoteI;

import javax.ejb.Stateless;

/**
 * Created by SELPHA on 8/3/2018.
 */
@Stateless
public class AdderRemote implements AdderRemoteI {
    public int add(int a, int b) {
        return  a+b;
    }
}
