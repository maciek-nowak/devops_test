package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/ping")
public class MainController {

    @GetMapping("/pik")
    public String getPingData() {
        String link = "{ \"status\": \"OK\", \"timestamp\": \"PUT_HERE_CURRENT_TIMESTAMP\" }";
        System.out.println(new Date().toString());
        return link;
    }

    @GetMapping("")
    public ResponseEntity<String> handleIfNoSuchIdExceptionOccurred() {
        String json = String.format("{ \"status\": \"OK\", \"timestamp\": \"%s\" }", new Date().toString());
        return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body(json);
    }
}
