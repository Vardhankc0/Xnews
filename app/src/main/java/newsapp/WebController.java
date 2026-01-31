package newsapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String index() {
        // Because this is a @Controller, returning this string tells 
        // Spring to look for index.html in the static folder
        return "forward:/index.html"; 
    }
}