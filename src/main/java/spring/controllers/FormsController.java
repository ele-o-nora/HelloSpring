package spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import spring.entities.Person;
import spring.services.NameService;

@Controller
public class FormsController {
	
	@Autowired
	private NameService nameService;
	
	@RequestMapping("/processform1")
	public String addname(@RequestParam(value="name") String name, Model model) {
		nameService.insertPerson(name);
		model.addAttribute("name", name);
		return "hello";
	}
	
	@RequestMapping("/processform2")
	public String greetbyid(@RequestParam(value="id") String id, Model model) {
		Person p = nameService.getPersonById(Integer.parseInt(id));
		model.addAttribute("name", p.getName());
		return "hello";
	}
	
	@RequestMapping("/greetbyid")
	public String idList(Model model) {
		List<Person> list = nameService.getAllPersons();
		model.addAttribute("personsList", list);
		return "greetbyid";
	}
	
	@RequestMapping("/addname")
	public String addName() {
		return "addname";
	}
}
