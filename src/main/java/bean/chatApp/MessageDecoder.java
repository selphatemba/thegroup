package bean.chatApp;

import com.google.gson.Gson;

import javax.websocket.DecodeException;
import javax.websocket.Decoder;
import javax.websocket.EndpointConfig;

/**
 * Created by SELPHA on 13/3/2018.
 */
public class MessageDecoder implements Decoder.Text<Message> {
    private static Gson gson=new Gson();
    public Message decode(String s) throws DecodeException {
        return gson.fromJson(s,Message.class);
    }

    public boolean willDecode(String s) {
        return (s!=null);
    }

    public void init(EndpointConfig endpointConfig) {

    }

    public void destroy() {

    }
}