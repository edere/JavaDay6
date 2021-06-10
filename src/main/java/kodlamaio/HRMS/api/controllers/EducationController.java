package kodlamaio.HRMS.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HRMS.business.Abstract.IResumeEducationService;
import kodlamaio.HRMS.core.result.DataResult;
import kodlamaio.HRMS.core.result.Result;
import kodlamaio.HRMS.entities.Concrete.ResumeEducation;

@RestController
@RequestMapping("/api/education")
public class EducationController {

private IResumeEducationService educationService;
	
	@Autowired
	public EducationController(IResumeEducationService educationService) {
		super();
		this.educationService = educationService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody ResumeEducation schoolForCV){
		return this.educationService.add(schoolForCV);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody ResumeEducation schoolForCV){
		return this.educationService.update(schoolForCV);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestParam int id){
		return this.educationService.delete(id);
	}
	
	@GetMapping("/getbyid")
	public DataResult<ResumeEducation> getById(@RequestParam int id){
		return this.educationService.getById(id);
	}
	
	@GetMapping("/getall")
	public DataResult<List<ResumeEducation>> getAll(){
		return this.educationService.getAll();
	}
	
	@GetMapping("/getAllByCandidateIdOrderByEndDescd")
	public DataResult<List<ResumeEducation>> getAllByJobseekerIdOrderByEndedDateDesc(@RequestParam int id){
		return this.educationService.getAllByJobseekerIdOrderByEndedDateDesc(id);
	}
	
	@GetMapping("/getAllByCandidateId")
	public DataResult<List<ResumeEducation>> getAllByCandidateId(@RequestParam int id){
		return this.educationService.getAllByJobSeekerId(id);
	}
}
