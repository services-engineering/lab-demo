package com.d2iq.training.labdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnvVariableLabController {

    private String envOne = "";
    private String envTwo = "";

    public EnvVariableLabController(@Value("#{environment.ENV_ONE}") String envOne, @Value("${env_two}") String envTwo) {
        this.envOne = envOne;
        this.envTwo = envTwo;
    }

    @GetMapping("/env_one")
    public String getEnvOne() {
        return envOne;
    }

    @GetMapping("/env_two")
    public String getEnvTwo() {
        return envTwo;
    }

}
