package com.tuandev.zen_zii.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class IndexController {
    @GetMapping("/")
    public String index(){
        return "Index Page";
    }
}
