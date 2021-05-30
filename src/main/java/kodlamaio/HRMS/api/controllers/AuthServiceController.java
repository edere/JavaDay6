package kodlamaio.HRMS.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HRMS.business.Abstract.IAuthService;
import kodlamaio.HRMS.core.result.Result;
import kodlamaio.HRMS.entities.Concrete.Employer;
import kodlamaio.HRMS.entities.Concrete.JobSeeker;

@RestController
@RequestMapping("/api/authService")
public class AuthServiceController {

	private IAuthService authService;
	 
	@Autowired
	public AuthServiceController(IAuthService authService) {
		this.authService = authService;
	}
	
	@PostMapping("/registerEmployer")
	public Result registerEmpolyer(@RequestBody Employer employer, String confirmPassword)
	{
		return authService.registerEmployer(employer, confirmPassword);
	}
	
	@PostMapping("/registerJobseeker")
	public Result registerJobseeker(@RequestBody JobSeeker jobSeeker, String confirmPassword)
	{
		return authService.registerJobSeeker(jobSeeker, confirmPassword);
	}
}
