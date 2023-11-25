package com.bilgeadam.springfeignclientdemo.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="springTestApi", url = "http://localhost:8080")
public interface FeignTestClient {
    @GetMapping("/api/test")
    ResponseEntity<String> getTestString();
}
