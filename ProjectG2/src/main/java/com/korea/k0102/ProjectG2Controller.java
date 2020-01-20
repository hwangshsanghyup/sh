package com.korea.k0102;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProjectG2Controller {
	
	@RequestMapping("/hello.do")
	public String hello() {
		return "hello";
	}

}
