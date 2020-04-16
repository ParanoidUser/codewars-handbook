package hello;

import org.springframework.stereotype.Controller;

@Controller
class HomeController {
    final String text = String.format("Hello %s!", System.getProperty("name"));

    String greeting() {
        return text;
    }
}