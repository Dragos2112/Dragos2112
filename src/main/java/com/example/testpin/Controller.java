package com.example.testpin;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class Controller {

    @GetMapping("/test")
    public ResponseEntity<String> makeTest(){
        return new ResponseEntity<String>("test response", HttpStatus.OK);
    }
}
