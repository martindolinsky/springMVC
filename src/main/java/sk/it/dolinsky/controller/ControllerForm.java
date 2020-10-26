package sk.it.dolinsky.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("form")
public class ControllerForm {

    @RequestMapping("/showForm")
    public String showForm(){
        return "form";
    }

    @RequestMapping("/processForm")
    public String processForm(){
        return "formData";
    }

    @RequestMapping("processFormV2")
    public String print(HttpServletRequest request, Model model){

        String name = request.getParameter("name");
        name = name.toUpperCase();

        model.addAttribute("message", "Hello " + name + "!");
        return "formData";
    }

    @RequestMapping("/processFormV3")
    public String processFormVersionThree(@RequestParam("name") String name, Model model) {
        name = name.toUpperCase();

        String result = "Hey my friend from Version 3! " + name;
        model.addAttribute("message", result);

        return "formData";
    }
}
