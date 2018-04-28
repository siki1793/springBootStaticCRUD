package io.saikrishna.apps.spring.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApi {
	
	@RequestMapping("/hello")
	public String sayHi() {
		return "Hello saikrishna";
	}

}
