package com.ug.citest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloWorld {

  @RequestMapping("/")
  public String hello(){
      return "Hello World updated!";
  }

}
