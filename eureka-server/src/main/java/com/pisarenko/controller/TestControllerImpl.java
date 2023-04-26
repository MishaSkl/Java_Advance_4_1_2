package com.pisarenko.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestControllerImpl {

    private final TestController testController;

    @Autowired
    public TestControllerImpl(TestController testController) {
        this.testController = testController;
    }

    @GetMapping()
    public String testMethod() {
        return testController.newTest();
    }

}
