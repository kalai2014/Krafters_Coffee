package com.krafters.backendWebApp;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/krafters")
public class KraftersController {

    @RequestMapping ("/home")
    public String home(){
        return "Welcome to Krafters";
    }
}
