package com.jitesh.schoolbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    StudentRepository repo;
  @GetMapping("/")
  public String index() {


      return repo.findByGrade("A").toString();
  }

}