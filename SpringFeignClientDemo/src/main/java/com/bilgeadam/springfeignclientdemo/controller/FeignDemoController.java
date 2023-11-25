package com.bilgeadam.springfeignclientdemo.controller;

import com.bilgeadam.springfeignclientdemo.feign.FeignTestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignDemoController {

    @Autowired
    FeignTestClient feignTestClient;

    @GetMapping("api/feign/test")
    public ResponseEntity<String> test(){
        return feignTestClient.getTestString();
    }
}
