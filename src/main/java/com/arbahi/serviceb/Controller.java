package com.arbahi.serviceb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/service-b")
public class Controller {
    private final FeignClient serviceAFeignClient;

    public Controller(FeignClient serviceAFeignClient) {
        this.serviceAFeignClient = serviceAFeignClient;
    }

    @GetMapping("/call-service-a")
    public String callServiceA() {
        return "Response from Service-A: " + serviceAFeignClient.getGreeting();
    }
}
