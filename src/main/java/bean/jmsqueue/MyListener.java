package bean.jmsqueue;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * Created by SELPHA on 8/3/2018.
 */
public class MyListener implements MessageListener {
    public void onMessage(Message message) {
        try {
            TextMessage msg= (TextMessage) message;
            System.out.println("the following message i received"+msg.getText());
        } catch (JMSException e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }
}
