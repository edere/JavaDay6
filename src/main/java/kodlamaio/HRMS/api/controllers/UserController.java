package kodlamaio.HRMS.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HRMS.business.Abstract.IUserService;
import kodlamaio.HRMS.core.result.DataResult;
import kodlamaio.HRMS.entities.Concrete.User;

@RestController
@RequestMapping("/api/user")
public class UserController {

	private IUserService userService;

	@Autowired
	public UserController(IUserService userService) {
		super();
		this.userService = userService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<User>> getAll(){
		return this.userService.getAll();
	}
}
