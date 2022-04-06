package com.example.freemoneynoscam.controllers;

import com.example.freemoneynoscam.repository.connectToDB;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.context.request.WebRequest;

@Controller
public class IndexController {
    connectToDB connect = new connectToDB();

    @GetMapping("/")
    public String index(){
        return "index";
    }

    //Save to DataBase
    @PostMapping("/test")
    public String test(WebRequest dataFromForm){
        System.out.println(dataFromForm.getParameter("email"));
        connect.insertData(dataFromForm.getParameter("email"));
        return "redirect:/";
    }
}
