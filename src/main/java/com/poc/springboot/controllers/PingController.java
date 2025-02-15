package com.poc.springboot.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poc.springboot.models.Ping;

@RestController
@RequestMapping("/ping")
public class PingController {

  private static final Logger logger = LoggerFactory.getLogger(PingController.class);

  @GetMapping
  public Ping ping() {
    logger.info("logging ping request correctly");
    return new Ping();
  }
}
