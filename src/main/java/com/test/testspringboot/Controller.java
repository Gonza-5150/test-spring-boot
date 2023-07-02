package com.test.testspringboot;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class Controller {
    // Course: id, name, author
    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
                new Course(1, "Learn Docker", "Gonza"),
                new Course(2, "Learn Devops", "Gonza"),
                new Course(3, "Learn Raspi", "Gonza")
        );
    }
}
