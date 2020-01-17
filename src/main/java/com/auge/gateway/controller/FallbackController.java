package com.auge.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class FallbackController {

    @GetMapping("myfallback")
    public Object examFallback() {
        Map<String, Object> result = new HashMap<>();
        result.put("data", null);
        result.put("message", "调用频次过高，请稍后重试! ");
        result.put("code", 500);
        return result;
    }
}
