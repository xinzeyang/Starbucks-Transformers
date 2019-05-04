package springbootfinalproject.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springbootfinalproject.model.User;
import springbootfinalproject.model.dao.UserDAO;

@RestController
@RequestMapping("/company")
public class UserController {

	@Autowired
	UserDAO userDAO;
	
	/* to save any user*/
	@PostMapping("/users")
	public User createUser(@Valid @RequestBody User user) {
		return userDAO.save(user);
	}
	
	/* to get user by particular Username*/
	@GetMapping("/user/{id}")
	public ResponseEntity<User> getUserById(@PathVariable(value="id") Long userid){
		User user = userDAO.findOne(userid);
		
		if(user == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(user);
	}
}
