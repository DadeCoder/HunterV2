package com.dade.test.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Dade on 2016/10/25.
 */
@RestController
@RequestMapping("/api/rest")
public class RestClient {

    private RestTemplate template = new RestTemplate();

    private final static String url = "http://localhost:8090/api/rest/show/";

    @RequestMapping(value = "/show/{age}", method = RequestMethod.GET)
    public String getUserById(@PathVariable Integer age) {
        return template.getForObject(url + "{age}", String.class, age);
    }

}
