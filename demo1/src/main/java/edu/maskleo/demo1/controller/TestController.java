package edu.maskleo.demo1.controller;

import edu.maskleo.demo1.domain.Test;
import edu.maskleo.demo1.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("query-all")
    public ResponseEntity<List<Test>> selectAll() {
        return ResponseEntity.ok(testService.selectAll());
    }

}
