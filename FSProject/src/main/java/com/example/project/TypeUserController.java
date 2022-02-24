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
public class TypeUserController {
	
	@Autowired
	private TypeUserRepository typeUserRepository;
	
	@GetMapping("/typeusers")
	public @ResponseBody Iterable<TypeUser> getAllTypeUsers() {
		return this.typeUserRepository.findAll();
	}
	
	@GetMapping("/typeusers/{id}")
	public @ResponseBody TypeUser getUser(@PathVariable int id) {
		return this.typeUserRepository.findById(id).get();
	}
	
	@PostMapping("/typeusers")
	void addTypeUser(@RequestBody TypeUser typeUser) {
		this.typeUserRepository.save(typeUser);
	}
	
	@PutMapping("/typeusers")
	void replaceEmployee(@RequestBody TypeUser typeUser) {
		this.typeUserRepository.save(typeUser);
	}
	
	@DeleteMapping("/typeusers/{id}")
	public @ResponseBody int deleteUser(@PathVariable int id) {
		try {
			this.typeUserRepository.deleteById(id);
			return 200;
		} catch (Exception e) {
			return 0;
		}
	}
}
