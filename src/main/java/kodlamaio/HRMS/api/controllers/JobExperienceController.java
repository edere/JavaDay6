package kodlamaio.HRMS.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HRMS.business.Abstract.IResumeExperienceService;
import kodlamaio.HRMS.core.result.DataResult;
import kodlamaio.HRMS.core.result.Result;
import kodlamaio.HRMS.entities.Concrete.ResumeExperience;

@RestController
@RequestMapping("/api/jobExperience")
public class JobExperienceController {

	
private IResumeExperienceService jobExperienceService;
	
	@Autowired
	public JobExperienceController(IResumeExperienceService jobExperienceService) {
		super();
		this.jobExperienceService = jobExperienceService;
	}
	
	@PostMapping("/add")
	public Result add( @RequestBody ResumeExperience jobExperience){
		return this.jobExperienceService.add(jobExperience);
		
	}
	
	@PostMapping("/update")
	public Result update( @RequestBody ResumeExperience jobExperience){
		return this.jobExperienceService.update(jobExperience);
		
	}
	
	@PostMapping("/delete")
	public Result delete( @RequestParam int  id){
		return this.jobExperienceService.delete(id);
		
	}
	
	@GetMapping("/getall")
	public DataResult<List<ResumeExperience>> getAll(){
		return this.jobExperienceService.getAll();
	}
	
	@GetMapping("/getAllByCandidateId")
	public DataResult<List<ResumeExperience>> getAllByCandidateId(@RequestParam int id){
		return this.jobExperienceService.getAllByJobSeekerId(id);
	}
}
