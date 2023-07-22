package com.spring.jpa.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.jpa.dto.Usersdto;
import com.spring.jpa.service.UsersService;

@RestController
@RequestMapping("/users")
public class UsersController {
	
	@Autowired
	private UsersService usersService;
	
	
	@PostMapping(value = "/create")
	public Usersdto createUsers (@RequestBody Usersdto usersdto) {
		usersdto.setCreated_date(LocalDateTime.now());
		usersService.saveUsers(usersdto);
		return usersdto;
	}
	
	@PutMapping(value = "/update")
	public Usersdto updateUsers (@RequestBody Usersdto usersdto) {
		//users.setCreated_date(LocalDateTime.now());
		usersService.saveUsers(usersdto);
	return usersdto;
	}	
	
	@GetMapping("getall")
	public Usersdto getAll() {
	
		return usersService.getAll();
		
	}
	

	
	/*@GetMapping(value = "/search/{name}")
	public List<Users> searchUsersByName(@PathVariable("name")String name) {
		//users.setCreated_date(LocalDateTime.now());
		return usersService.searchAllUsersByName(name);
	}
	@GetMapping(value = "/get/{id}")
	public Users getById(@PathVariable("id") UUID id) {
		Optional<Users> usersOptional = usersService.getById(id);
		return usersOptional.get();
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public void deleteUsers(@PathVariable UUID id) {
		usersService.deleteUsers(id);
				
		}
	
	@Autowired
	private UserscaService userscaService;
	
	@PostMapping(value = "/createCA")
	public UsersCA createCAUsers (@RequestBody UsersCA usersca) {
		//users.setCreated_date(LocalDateTime.now());
		userscaService.saveUsersCA(usersca);
	return usersca;
	}*/
}
