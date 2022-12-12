package webSocketServer;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/hello")
public class WebSocketServer {

    private Session session;
    private EndpointConfig endpointConfig;

    private Logger logger = Logger.getLogger(WebSocketServer.class);

    public WebSocketServer() {
        BasicConfigurator.configure();
//        ClientEndpointConfig builder = ClientEndpointConfig.Builder.create().build();
//        System.out.println("builder: " + builder);
        logger.info("WEB SOCKET SERVER YEAH !");
    }

    @OnOpen
    public void createSession(Session session, EndpointConfig endpointConfig) {
        this.session = session;
        this.endpointConfig = endpointConfig;
        System.out.println("session: " + session);
        System.out.println("endpointConfig: " + endpointConfig);
    }

}
