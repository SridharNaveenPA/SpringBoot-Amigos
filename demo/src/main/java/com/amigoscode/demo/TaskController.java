package com.amigoscode.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



@RestController
@RequestMapping("/TASK")
public class TaskController {

    @GetMapping
    public List<Task> getTasks() {
        return List.of(
                new Task(1, "JAVA ASS"),
                new Task(2, "WT OBS")
        );
    }
}

class Task {
    private int id;
    private String name;

    public Task(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}