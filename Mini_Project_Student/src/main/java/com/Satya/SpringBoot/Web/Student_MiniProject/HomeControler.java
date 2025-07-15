package com.Satya.SpringBoot.Web.Student_MiniProject;

import com.Satya.SpringBoot.Web.Student_MiniProject.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeControler {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @PostMapping("/result")
    public String result(@ModelAttribute Student student) {
        return "result";
    }
}
