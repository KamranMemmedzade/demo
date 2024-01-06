package org.example.controller;


import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Home controller", description = "Home Page APIs")
@RequestMapping(produces = "application/json")
@RestController
public class HomeController {

  @GetMapping("/home")
  public String openHome() {
    return "This is home controller response";
  }


}
