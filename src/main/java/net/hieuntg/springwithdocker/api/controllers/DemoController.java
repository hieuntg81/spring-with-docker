package net.hieuntg.springwithdocker.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping(value = "/test")
    public String demo() {
        return "HELLO WORLD";
    }
}