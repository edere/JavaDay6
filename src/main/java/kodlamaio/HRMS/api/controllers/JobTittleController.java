package kodlamaio.HRMS.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HRMS.business.Abstract.IJobTitleService;
import kodlamaio.HRMS.entities.Concrete.JobTittle;

@RestController
@RequestMapping ("/api/jobtitles")
public class JobTittleController {

	private IJobTitleService jobTitleService;

	@Autowired
	public JobTittleController(IJobTitleService jobTitleService) {
		super();
		this.jobTitleService = jobTitleService;
	}
	
	@GetMapping("/getall")
	public List<JobTittle> getAll(){
		return this.jobTitleService.getAll();
	}
}
