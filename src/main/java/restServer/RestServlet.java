package restServer;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import java.io.IOException;

public class RestServlet extends HttpServlet {

    private Logger logger = Logger.getLogger(RestServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) {
        System.out.println("GET REQUEST HERE !");
        // TODO: below doesn't work
        logger.info("GET REQUEST HERE TOO!");
        // On tomcat client and server are on same origin
        res.addHeader("test", "heder!");
        res.addHeader("Access-Control-Allow-Origin", "*");
        res.addHeader("Access-Control-Allow-Headers", "Content-type");
        res.addHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE");

        res.setStatus(200);
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        super.service(req, res);
    }

}
