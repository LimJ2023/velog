package com.in28minutes.rest.webservices.restfulwebservices;


import org.springframework.web.bind.annotation.*;

//1. REST API
@RestController
public class HelloWorldController
{
    //2. url /hello-world
//    @RequestMapping(method = RequestMethod.GET, path = "/hello-world")
    //3. output "Hello World"
    @GetMapping(path = "/hello-world" )
    public String helloWorld() {
        return "Hello World";
    }
    @GetMapping(path = "/hello-world-bean" )
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello World");
    }
    // /users/{id}/todos/{id}

    @GetMapping(path = "/hello-world/path-variable/{name}" )
    public HelloWorldBean helloWorldPath(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello world, %s",name));
    }
}
