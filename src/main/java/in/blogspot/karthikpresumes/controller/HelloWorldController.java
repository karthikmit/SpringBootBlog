package in.blogspot.karthikpresumes.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by karthik on 5/22/15.
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    String sayHello() {
        return "Hello!";
    }
}
