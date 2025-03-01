package ru.example.edu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.example.edu.model.Student;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        return "Hello " + name;
    }

    @GetMapping("/student")
    public Student getStudent() {
        Student st = new Student(
                1,
                "Valer",
                "valera@ya.ru",
                19
        );
        return st;
    }

}
