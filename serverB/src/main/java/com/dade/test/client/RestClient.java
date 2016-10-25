package com.dade.test.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.websocket.server.PathParam;

/**
 * Created by Dade on 2016/10/25.
 */
@RestController
@RequestMapping("/api/rest")
public class RestClient {

    private RestTemplate template = new RestTemplate();

    private final static String url = "http://localhost:8090/api/rest/show/";
    private final static String url_2 = "http://localhost:8090/api/rest/";

    // get
    @RequestMapping(value = "/show/{age}", method = RequestMethod.GET)
    public String getUserById(@PathVariable Integer age) {
        return template.getForObject(url + "{age}", String.class, age);
    }

    @RequestMapping(value = "/show/{name}/{age}", method = RequestMethod.GET)
    public String getUserByNameAndId(@PathVariable String name,
                                    @PathVariable Integer age) {
        return template.getForObject(url + "{name}/{age}", String.class, name, age);
    }

    @RequestMapping(value = "/show", method = RequestMethod.GET)
    public String getById(@RequestParam Integer age) {
        return template.getForObject(url + "?age="+age, String.class);
    }

    // post

    @RequestMapping(value = "/show_post", method = RequestMethod.POST)
    public String postUserById(@RequestBody TestModel model) {
        return template.postForObject(url_2 + "add", model, String.class);
        //return model.getName();
    }




}
