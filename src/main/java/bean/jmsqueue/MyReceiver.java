package bean.jmsqueue;

import javax.jms.*;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 * Created by SELPHA on 8/3/2018.
 */
public class MyReceiver {
    public void receiver(){
        try{
            InitialContext ctxt=new InitialContext();
            QueueConnectionFactory f=(QueueConnectionFactory) ctxt.lookup("ConnectionFactory");
            QueueConnection con=f.createQueueConnection();
            con.start();
            QueueSession ses=con.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);
            Queue t=(Queue) ctxt.lookup("jmsqueue/queue/DLQ");
            QueueReceiver receiver=ses.createReceiver(t);
            MyListener listener=new MyListener();
            receiver.setMessageListener(listener);
            System.out.println("Receiver1 is ready, waiting for messages...");
            con.close();
//            System.out.println("press Ctrl+c to shutdown...");
//            while(true){
//                Thread.sleep(1000);
//            }
        }catch(NamingException n){
            n.printStackTrace();
        }catch (JMSException jms){
            jms.printStackTrace();
        }
}

}
