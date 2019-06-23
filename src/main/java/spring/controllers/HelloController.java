package spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	@RequestMapping({"/","/hello"})
	public String welcomeMessage(
			@RequestParam(value = "name", required = false, defaultValue="You") String name, Model model) {
		model.addAttribute("name", name);
		return "hello";
	}
}
