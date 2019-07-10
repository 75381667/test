package com.pan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PanApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext app = SpringApplication.run(PanApplication.class, args);
 

		//System.out.println(app.getEnvironment().getProperty("name"));

	}

}
