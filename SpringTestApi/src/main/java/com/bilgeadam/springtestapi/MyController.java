package com.bilgeadam.springtestapi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/api/test")
    public ResponseEntity<String> test(){
        return ResponseEntity.ok().body("This response comes from Spring Rest API");
    }
}
