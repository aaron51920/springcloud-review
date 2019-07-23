package com.example.eurekaconsumerfeign.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("eureka-client")
public interface DcFeign {

    @GetMapping("dc")
    String dc();
}
