package sgi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
	@GetMapping({"/"})
	public String index()
	{
		return "login";
	}
	
	@GetMapping("/home")
	public String home()
	{
		return "home";
	}

	
	
}
