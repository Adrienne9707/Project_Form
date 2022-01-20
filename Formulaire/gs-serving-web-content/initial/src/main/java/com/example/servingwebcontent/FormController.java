package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {

    @GetMapping("/form")
    public String greeting(@RequestParam(name="name", required=false) String name, Model model) {
        model.addAttribute("name", name);
        return "form";
    }

}