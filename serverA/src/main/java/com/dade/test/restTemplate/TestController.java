package com.dade.test.restTemplate;

import org.springframework.web.bind.annotation.*;

/**
 * Created by Dade on 2016/10/25.
 */
@RestController
@RequestMapping("/api/rest")
public class TestController {

    @RequestMapping(value = "/show/{name}/{age}", method = RequestMethod.GET)
    public TestModel showModel(@PathVariable String name,
                                @PathVariable  Integer age){
        String res = "hello "+name + ", i am serva b!";
        TestModel model = new TestModel();
        model.setId("id");
        model.setAge(age);
        model.setName(name);
        return model;
    }

    @RequestMapping(value = "/show/{age}", method = RequestMethod.GET)
    public TestModel showModelByAge(@PathVariable  Integer age){
        TestModel model = new TestModel();
        model.setId("id");
        model.setAge(age);
        model.setName("serve a");
        return model;
    }


}
