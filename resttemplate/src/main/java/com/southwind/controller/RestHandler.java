package com.southwind.controller;

import com.southwind.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import sun.rmi.runtime.Log;

import java.util.Collection;

@RestController
@RequestMapping("/rest")
public class RestHandler {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/findAll")
    public Collection<Student> findAll(){
        return restTemplate.getForEntity("http://localhost:8010/student/findAll",Collection.class).getBody();
    }

    @GetMapping("/findAll2")
    public Collection<Student> findAll2(){
        return restTemplate.getForObject("http://localhost:8010/student/findAll",Collection.class);
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") long id){
        return restTemplate.getForEntity("http://localhost:8010/student/findById/{id}",Student.class,id).getBody();
    }

    @RequestMapping("/save")
    public void save(@RequestBody Student student){
        restTemplate.postForEntity("http://localhost:8010/student/save",Student.class,null).getBody();
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student){
        restTemplate.put("http://localhost:8010/student/update",student);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id){
        restTemplate.delete("http://localhost:8010/student/deleteById/{id}",id);
    }
}
