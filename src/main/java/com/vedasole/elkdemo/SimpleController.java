package com.vedasole.elkdemo;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    private static final Logger LOG = LogManager.getLogger(SimpleController.class);

    @GetMapping(value = "/echo")
    public String echoMessage() {
        LOG.log(Level.INFO, "Echo Triggered");
        return "Echo Triggered";
    }

}