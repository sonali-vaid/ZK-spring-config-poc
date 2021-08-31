package com.config.configpoc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigPocController{

	@Autowired
   ConfigProperties properties;

	/*
	 * @Autowired Environment env;
	 */
	
	/*
	 * @GetMapping("/properties/display") public String displayProperties() { return
	 * properties.getPropName(); }
	 */
	 
   
   @GetMapping("/properties/show")
   public ConfigProperties showProperties() {
	   //properties.setProperty5("7171");
      return properties;
   }
}
