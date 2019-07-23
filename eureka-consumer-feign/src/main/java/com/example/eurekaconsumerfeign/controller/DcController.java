package com.example.eurekaconsumerfeign.controller;

import com.example.eurekaconsumerfeign.feign.DcFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DcController {

    @Autowired
    DcFeign dcFeign;

    @GetMapping("consumer")
    public String dc(){
        return dcFeign.dc();
    }
}
