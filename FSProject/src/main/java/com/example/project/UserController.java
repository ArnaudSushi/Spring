package com.example.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@GetMapping("/users")
	public @ResponseBody Iterable<User> getAllTypeUsers() {
		return this.userRepository.findAll();
	}

	@GetMapping("/users/{id}")
	public @ResponseBody User getUser(@PathVariable int id) {
		return this.userRepository.findById(id).get();
	}

	@PostMapping("/users")
	void addTypeUser(@RequestBody User User) {
		this.userRepository.save(User);
	}

	@PutMapping("/users")
	void replaceUser(@RequestBody User user) {
		this.userRepository.save(user);
	}

	@DeleteMapping("/users/{id}")
	void deleteUser(@PathVariable int id) {
		this.userRepository.deleteById(id);
	}
}
