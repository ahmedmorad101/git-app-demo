package org.vision.git_app_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public String index(){
        return "Index Page";
    }

    @GetMapping
    @RequestMapping("/home")
    public Person home(){
        return Person.builder().name("Ahmed Mourad").age(43).build();
    }
}
