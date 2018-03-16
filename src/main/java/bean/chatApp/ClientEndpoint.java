package bean.chatApp;

import javax.enterprise.context.ApplicationScoped;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import java.io.IOException;

/**
 * Created by SELPHA on 13/3/2018.
 */
@ApplicationScoped
@javax.websocket.ClientEndpoint
public class ClientEndpoint {
    @OnOpen
    public void onOpen(Session session)throws IOException{
        System.out.println("Hello.....Client here........");
    }
    @OnMessage
    public void OnMessage(Session session,String message){
        System.out.println("my message is......"+message);

    }

}
