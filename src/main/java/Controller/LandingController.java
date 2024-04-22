package Controller;

import org.springframework.stereotype.Controller;

@Controller
public class LandingController {
    public String getLandingPage() {
        return "index";
    }
}
