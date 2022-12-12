//package restServer;
//
//import org.apache.http.HttpResponse;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.net.http.HttpRequest;
//import java.util.logging.Logger;
////
//@RestController
//public class RestServer {
//
//    Logger logger = Logger.getLogger(this.getClass().toString());
//
//    @RequestMapping("/test")
//    public String handleGet(HttpRequest req, HttpResponse res) {
//        System.out.println("GET REQUEST !");
//        logger.info("GET REQUEST ARRIVED");
//        return "!";
//    }
//}
