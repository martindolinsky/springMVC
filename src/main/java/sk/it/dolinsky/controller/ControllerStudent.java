package sk.it.dolinsky.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import sk.it.dolinsky.model.Student;

@Controller
@RequestMapping("/student")
public class ControllerStudent {

    @RequestMapping("/showForm")
    public String showForm(Model theModel){

        Student student = new Student();
        theModel.addAttribute("student", student);

        return "studentForm";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student student){

        return "studentFormData";
    }
}
