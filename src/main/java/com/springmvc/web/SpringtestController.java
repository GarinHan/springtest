package com.springmvc.web;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class SpringtestController {

    @RequestMapping("/springtest")
    public String springtest(Model model, String name){
        model.addAttribute("name",name);

        return "springtest";
    }
}
