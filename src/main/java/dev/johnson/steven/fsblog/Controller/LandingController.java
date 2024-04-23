package dev.johnson.steven.fsblog.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LandingController {

    @GetMapping("/")
    public String getLandingPage() {
        return "index";
    }
}
