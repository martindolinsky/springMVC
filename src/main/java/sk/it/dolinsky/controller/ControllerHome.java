package sk.it.dolinsky.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class ControllerHome {

    @RequestMapping
    public String printHello(Model model){
        model.addAttribute("message", "Main menu");
        return "home";
    }
}
