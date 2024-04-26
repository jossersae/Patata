package com.example.tra.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/patata")
@RequiredArgsConstructor
public class TraductorController {
    
    @PostMapping("/patata")
    public ResponseEntity<String> translate(){
       
        return ResponseEntity.status(HttpStatus.OK).body("patata");
    }
}
