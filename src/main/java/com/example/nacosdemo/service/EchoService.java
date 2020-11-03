package com.example.nacosdemo.service;


import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "SPRING-BOOT-SERVICE")
//@RibbonClient(name = "SPRING-BOOT-SERVICE")
public interface EchoService {

    @GetMapping(value = "/discovery/test")
    String echo();
}




