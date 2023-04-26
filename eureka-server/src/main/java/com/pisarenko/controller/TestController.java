package com.pisarenko.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;




@FeignClient(value = "feignDemo",url = "http://localhost:8081/api/books")
public interface TestController {

    @GetMapping("/new")
    String newTest();

}
