package edu.maskleo.demo1.controller;

import edu.maskleo.demo1.domain.Test;
import edu.maskleo.demo1.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("query/{id}")
    public ResponseEntity<Test> selectOne(@PathVariable int id) {
        return ResponseEntity.ok(testService.selectOne(id));
    }

}
