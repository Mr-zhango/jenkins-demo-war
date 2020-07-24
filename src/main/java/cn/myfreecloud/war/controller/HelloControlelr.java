package cn.myfreecloud.war.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControlelr {

    @GetMapping
    public ResponseEntity hello() {
        return ResponseEntity.ok("Hello jenkins war maven");
    }
}
