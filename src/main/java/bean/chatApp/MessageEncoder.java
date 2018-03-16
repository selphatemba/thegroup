package bean.chatApp;

import com.google.gson.Gson;

import javax.websocket.EncodeException;
import javax.websocket.Encoder;
import javax.websocket.EndpointConfig;

/**
 * Created by SELPHA on 13/3/2018.
 */
public class MessageEncoder implements Encoder.Text<Message> {
    private static Gson gson=new Gson();
    public String encode(Message message) throws EncodeException {
        return gson.toJson(message);
    }

    public void init(EndpointConfig endpointConfig) {

    }

    public void destroy() {

    }
}
