package com.in28munutes.springboot.learn_spring_boot;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
// http://localhost:8080/courses

//    [
//    {
//        "id": 1,
//        "name": "Learn AWS",
//        "author": "in28minutes"
//    }]

//REST API를 위한 어노테이션.
@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(
                new Course(1,"Learn AWS","in28minutes"),
                new Course(2,"Learn DevOps","in28minutes"),
                new Course(3,"Learn Azure","in28minutes")
        );
    }
}
