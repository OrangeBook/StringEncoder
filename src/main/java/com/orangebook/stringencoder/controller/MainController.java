package com.orangebook.stringencoder.controller;

import java.util.Base64;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

  @GetMapping("/main")
  public String main() {
    return "main";
  }

  @GetMapping("/encoder")
  public String goToEncoder() {
    return "encoder";
  }

  @PostMapping("/encoder/action")
  public ModelAndView action(@ModelAttribute("decoded_text") String attribute) {

    System.out.println(attribute);

    String encodedText = Base64.getEncoder().encodeToString(attribute.getBytes());
    ModelAndView modelAndView = new ModelAndView();
    modelAndView.addObject("encoded_text", encodedText);

    modelAndView.setViewName("encoder");
    return modelAndView;
  }
}
