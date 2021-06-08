package kodlamaio.HRMS.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HRMS.business.Abstract.IEmployerService;
import kodlamaio.HRMS.core.result.DataResult;
import kodlamaio.HRMS.core.result.Result;
import kodlamaio.HRMS.entities.Concrete.Employer;

@RestController
@RequestMapping("/api/employer")
public class EmployerController {
	
	private IEmployerService employerService;

	@Autowired
	public EmployerController(IEmployerService employerService) {
		super();
		this.employerService = employerService;
	}
	
	
	@PostMapping("/add")
	public Result add(@RequestBody Employer employer){
		return this.employerService.add(employer);
	}
	
	@GetMapping("/getall")
	public DataResult<List<Employer>> getAll(){
		
		return this.employerService.getAll();
	}
}
