package com.amigoscode.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/SDE1")
public class SDEController {
    @GetMapping("/")
    public List<SDE> getSDE(){
        return List.of(
                new SDE("Srid",1,"JAVA FIGMA "),
                new SDE("Ambendran",2,"UI UIX"),
                new SDE("DVD",3,"Logo Designer")
        );
    }
}
