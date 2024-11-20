package com.arbahi.serviceb;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.cloud.openfeign.FeignClient(name = "service-a", ,url = "https://servicea001.azurewebsites.net")
public interface FeignClient {
    @GetMapping("/api/service-a/greet")
    String getGreeting();
}
