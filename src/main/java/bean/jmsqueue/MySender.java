package bean.jmsqueue;

import javax.jms.*;
import javax.naming.InitialContext;
import javax.naming.NamingException;


/**
 * Created by SELPHA on 8/3/2018.
 */
public class MySender {
    public void sender(){
        //Create and start connection
        try{
            InitialContext ctxt=new InitialContext();
           QueueConnectionFactory f= (QueueConnectionFactory) ctxt.lookup("ConnectionFactory");
           QueueConnection con=f.createQueueConnection();
            con.start();
            QueueSession ses=con.createQueueSession(false,Session.AUTO_ACKNOWLEDGE);
            Queue t= (Queue) ctxt.lookup("jmsqueue/queue/DLQ");
            QueueSender sender=ses.createSender(t);
            TextMessage msg=ses.createTextMessage();

                msg.setText("testing......");
                sender.send(msg);
                System.out.println("Message successfully sent.");

            con.close();
        } catch (NamingException e) {
            e.printStackTrace();
            System.out.println(e);
        }catch (JMSException jms){
            jms.printStackTrace();
            System.out.println(jms);
        }

}
}

