package com.example.cdr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

  
  @GetMapping("/")
  public String home() {
    return "Query API Service is running on port 8080!";
  }

  
  @GetMapping("/api/v1/cdr/count")
  public long count(java.util.Optional<com.example.cdr.repository.CallDetailRecordRepository> repoOpt) {
    var repo = repoOpt.orElseThrow();
    return repo.count();
  }
}
