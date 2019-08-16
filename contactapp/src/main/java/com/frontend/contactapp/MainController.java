package com.frontend.contactapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/form")
    public String index() {
        return "index";
    }
}
