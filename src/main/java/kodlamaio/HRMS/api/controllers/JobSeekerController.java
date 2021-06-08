package kodlamaio.HRMS.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HRMS.business.Abstract.IJobSeekerService;
import kodlamaio.HRMS.core.result.DataResult;
import kodlamaio.HRMS.core.result.Result;
import kodlamaio.HRMS.entities.Concrete.JobSeeker;

@RestController
@RequestMapping("/api/jobSeeker")
public class JobSeekerController {

	private IJobSeekerService jobSeekerService;
	
	@Autowired
	public JobSeekerController(IJobSeekerService jobSeekerService) {
		super();
		this.jobSeekerService = jobSeekerService;
	}

	@PostMapping("/add")
	public Result add(@RequestBody JobSeeker jobSeeker){
		return this.jobSeekerService.Add(jobSeeker);
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobSeeker>> getAll(){
		return this.jobSeekerService.getAll();
	}
}
