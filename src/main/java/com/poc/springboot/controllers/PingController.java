package com.poc.springboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poc.springboot.models.Ping;

@RestController
@RequestMapping("/ping")
public class PingController {

  @GetMapping
  public Ping ping() {
    return new Ping();
  }
}
