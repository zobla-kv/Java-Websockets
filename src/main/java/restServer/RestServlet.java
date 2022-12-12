package restServer;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.ServletException;

import org.apache.log4j.Logger;
import java.io.IOException;

public class RestServlet extends HttpServlet {

    private Logger logger = Logger.getLogger(RestServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("GET REQUEST HERE !");
        logger.info("GET REQUEST HERE TOO!");
        res.addHeader("test", "heder!");
        res.addHeader("Access-Control-Allow-Origin", "*");
        res.addHeader("Access-Control-Allow-Headers", "Content-type");
        res.addHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE");

        res.setStatus(200);
    }
}
