package bean.chatApp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.ContainerProvider;
import javax.websocket.DeploymentException;
import javax.websocket.WebSocketContainer;
import java.io.IOException;
import java.net.URI;

/**
 * Created by SELPHA on 13/3/2018.
 */
@WebServlet(urlPatterns = "/chatapp")
public class ChatApplication extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        WebSocketContainer wsc= ContainerProvider.getWebSocketContainer();
        try {
            wsc.connectToServer(ClientEndpoint.class, URI.create("ws://localhost:8080/thegroup/chat"));
        } catch (DeploymentException e) {
            e.printStackTrace();
        }
    }
}
