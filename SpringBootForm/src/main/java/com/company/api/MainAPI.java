package com.company.api;

import java.util.Arrays;
import java.util.List;

import com.company.model.User;
import com.company.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainAPI {

	@Autowired
	private UserService userService;

	@GetMapping("/register")
	public String showForm(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		
		List<String> listProfession = Arrays.asList("Developer", "Tester", "Architect");
		model.addAttribute("listProfession", listProfession);

		return "register_form";
	}
	@PostMapping("/register")
	public String saveUser(@ModelAttribute("user") User user) {
		// save user to database
		userService.saveUser(user);
		return "register_success";
	}
	@GetMapping("/deleteUser/{id}")
	public String deleteUser(@PathVariable(value = "id") long id) {

		// call delete employee method
		this.userService.deleteUserById(id);
		return "redirect:/";
	}
}
