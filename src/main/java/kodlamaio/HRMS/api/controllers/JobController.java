package kodlamaio.HRMS.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HRMS.business.Abstract.IJobService;
import kodlamaio.HRMS.core.result.DataResult;
import kodlamaio.HRMS.core.result.Result;
import kodlamaio.HRMS.entities.Concrete.Job;

@RestController
@RequestMapping("/api/jobs")
public class JobController {

	private IJobService jobService;

	@Autowired
	public JobController(IJobService jobService) {
		super();
		this.jobService = jobService;
	}
	@GetMapping("/getall")
	public DataResult<List<Job>> getAll(){
		
      return this.jobService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Job job) {
		
		return this.jobService.add(job);
	}
	
	
}
