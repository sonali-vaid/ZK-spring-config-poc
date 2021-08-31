package com.config.configpoc.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("config")
public class ConfigProperties{

	
	/*
	 * @Value("${config.property.name}") private String propName;
	 * 
	 * public String getPropName() { return propName; }
	 * 
	 * public void setPropName(String propName) { this.propName = propName; }
	 */
	 
   //TODO - add with @value and test
	private String property1;
	
	private String property2;
	
	@Value("config.property3")
	private String property3;
	
	private String property4;

	private String property5;
	
	private String property6;
	
	@Value("config.property7")
	private String property7;
	
	public String getProperty1() {
		return property1;
	}

	public void setProperty1(String property1) {
		this.property1 = property1;
	}

	public String getProperty2() {
		return property2;
	}

	public void setProperty2(String property2) {
		this.property2 = property2;
	}

	public String getProperty3() {
		return property3;
	}

	public void setProperty3(String property3) {
		this.property3 = property3;
	}

	public String getProperty4() {
		return property4;
	}

	public void setProperty4(String property4) {
		this.property4 = property4;
	}

	public String getProperty5() {
		return property5;
	}

	//whether it can be wired with environment. in which order it will read/precedence
	public void setProperty5(String property5) {
		this.property5 = property5;
	}

	public String getProperty6() {
		return property6;
	}

	public void setProperty6(String property6) {
		this.property6 = property6;
	}

	public String getProperty7() {
		return property7;
	}

	public void setProperty7(String property7) {
		this.property7 = property7;
	}
	
}
