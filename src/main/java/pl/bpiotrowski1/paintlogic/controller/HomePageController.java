package pl.bpiotrowski1.paintlogic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Controller
public class HomePageController {

    @GetMapping
    public String startGame() {
        return "home";
    }

}
