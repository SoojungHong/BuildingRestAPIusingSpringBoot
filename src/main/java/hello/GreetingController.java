package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by a613274 on 04.04.2017.
 * Create a resource controller
 * In Spring’s approach to building RESTful web services, HTTP requests are handled by a controller.
 * These components are easily identified by the @RestController annotation,
 * and the GreetingController below handles GET requests for /greeting by returning a new instance of the Greeting class:
 */
@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        //return new Greeting(counter.incrementAndGet(), String.format(template, name));
        return new Greeting(11, "You are beautiful");
    }
}