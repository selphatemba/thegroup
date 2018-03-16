package bean.jmstopic;

import javax.jms.*;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 * Created by SELPHA on 8/3/2018.
 */
public class Publisher {
    void publish(){
        InitialContext ctxt= null;
        try {
            ctxt = new InitialContext();
            QueueConnectionFactory f= (QueueConnectionFactory) ctxt.lookup("ConnectionFactory");
            QueueConnection con=f.createQueueConnection();
            con.start();
            QueueSession ses=con.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);
            Topic topic=ses.createTopic("customerTopic");

            MessageConsumer consumer1=ses.createConsumer(topic);

        } catch (NamingException e) {
            e.printStackTrace();
        }catch (JMSException jms){
            jms.printStackTrace();

        }


    }

}
