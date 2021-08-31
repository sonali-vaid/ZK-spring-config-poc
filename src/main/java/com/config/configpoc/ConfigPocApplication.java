package com.config.configpoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.config.configpoc.controller.ConfigProperties;

@SpringBootApplication
public class ConfigPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigPocApplication.class, args);
	}

}
