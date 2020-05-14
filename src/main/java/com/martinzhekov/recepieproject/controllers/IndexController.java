package com.martinzhekov.recepieproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by martinzhekov on 13.05.20
 */

@Controller
public class IndexController {

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(){
        System.out.println("Save message to say... 1234588");
        return "index";
    }
}
