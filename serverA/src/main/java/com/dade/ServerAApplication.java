package com.dade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
@ComponentScan(basePackages={"com.dade"})
@SpringBootApplication
public class ServerAApplication {
	public static void main(String[] args) {
		SpringApplication.run(ServerAApplication.class, args);
	}
}
