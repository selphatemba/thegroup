package bean.jmsqueue;

import javax.ejb.MessageDriven;
import javax.jms.*;


/**
 * Created by SELPHA on 9/3/2018.
 */
public class MdbMyListener implements MessageListener {
    public void onMessage(Message message) {
        TextMessage msg = (TextMessage) message;
        try {
            System.out.println("Message received is" + msg.getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
