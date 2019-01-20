package com.shyroke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ServletComponentScan
@ImportResource(locations = { "classpath:druid-bean.xml" })
public class SpringbootMybatisDruidApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMybatisDruidApplication.class, args);
	}
}
