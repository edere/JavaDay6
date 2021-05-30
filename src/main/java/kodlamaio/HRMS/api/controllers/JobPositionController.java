package kodlamaio.HRMS.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HRMS.business.Abstract.IJobPositionService;
import kodlamaio.HRMS.entities.Concrete.JobPosition;

@RestController
@RequestMapping("/api/jobs")
public class JobPositionController {

	private IJobPositionService jobPositonService;
	
	@Autowired
	public JobPositionController(IJobPositionService jobPosiitonService) {
		
		this.jobPositonService = jobPosiitonService;
	}
	@GetMapping("/getAll")
	public @ResponseBody List<JobPosition> getAll(){
		return this.jobPositonService.getAll();
	}
}
