package com.dade.test;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Dade on 2016/10/25.
 */
@RestController
@RequestMapping("/api/test")
public class SameController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String sayHello(@RequestParam String name){

        String res = "hello " + name + ", i am serva a!";

        return res;

    }

}
