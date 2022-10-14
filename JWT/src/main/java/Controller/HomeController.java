package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Model.User;
import Repo.UserRepository;

@RestController
public class HomeController {

	@Autowired
	private UserRepository repo;
	
	@GetMapping("/")
	public String home () {
	    return "home";
	}
	
	@GetMapping("/user")
	public String home2() {
	    return "home user";
	}
	
	@PostMapping("/add")
	User user(@RequestBody User user) {		
		return repo.save(user);
		
	}
	
	
}
