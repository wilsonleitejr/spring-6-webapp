package guru.springframework.spring6webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import guru.springframework.spring6webapp.services.AuthorService;

@Controller
public class AuthorController {

	private final AuthorService authorService;

	public AuthorController(AuthorService authorService) {
		this.authorService = authorService;
	}

	 @GetMapping("/authors")
	 public String listAuthors(Model model) {
	 	model.addAttribute("authors", authorService.findAll());
	 	return "authors";
	 }

}
