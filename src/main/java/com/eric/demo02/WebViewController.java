package com.eric.demo02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebViewController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/account")
    public String account(){
        return "account";
    }
}
