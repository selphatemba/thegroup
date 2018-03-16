package bean.beanImpl;

import bean.beanI.StatefulI;

import javax.ejb.Stateful;
import javax.ejb.Stateless;

/**
 * Created by SELPHA on 8/3/2018.
 */
@Stateless
public class StatefulBean implements StatefulI{
    private double amount=0;

    public double add() {
        amount +=100;
        return amount;
    }
}
