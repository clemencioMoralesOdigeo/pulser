package com.clemenciomorales.pulser.pru.controllers;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Clemencio Morales Lucas.
 */

@RestController
@EnableAutoConfiguration
public class Pru {

    @RequestMapping("/hello")
    String hello() {
        return "hello world!";
    }
}
