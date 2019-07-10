package com.pan.control;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class HelloWorldController {
	 
 
	@RequestMapping("/hello")
	public String Hello() {
		return "Hello " ;
	}

	 
}
