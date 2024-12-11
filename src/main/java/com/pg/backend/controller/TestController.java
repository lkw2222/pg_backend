package com.pg.backend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class TestController {

    @GetMapping("/test")
    public ResponseEntity<?> testList() throws Exception {
        HashMap<String, Object> resultMap = new HashMap<>();
        resultMap.put("result", "안녕하세요. 테스트입니다.");

        return new ResponseEntity<Map<String, Object>> (resultMap, HttpStatus.OK);
    }
}
