package kodlamaio.HRMS.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HRMS.business.Abstract.IResumeSkillService;
import kodlamaio.HRMS.core.result.DataResult;
import kodlamaio.HRMS.core.result.Result;
import kodlamaio.HRMS.entities.Concrete.ResumeSkill;

@RestController
@RequestMapping("/api/skills")
public class SkillsController {

private IResumeSkillService resumeSkillService;
	
	
	@Autowired
	public SkillsController(IResumeSkillService resumeSkillService) {
		super();
		this.resumeSkillService = resumeSkillService;
	}
	
	@PostMapping("/add")
	public Result add( @RequestBody ResumeSkill resumeSkill){
		return this.resumeSkillService.add(resumeSkill);
		
	}
	
	@PostMapping("/update")
	public Result update( @RequestBody ResumeSkill resumeSkill){
		return this.resumeSkillService.update(resumeSkill);
		
	}
	
	@PostMapping("/delete")
	public Result delete( @RequestParam int  id){
		return this.resumeSkillService.delete(id);
		
	}
	
	@GetMapping("/getall")
	public DataResult<List<ResumeSkill>> getAll(){
		return this.resumeSkillService.getAll();
	}
	
	@GetMapping("/getAllByCandidateId")
	public DataResult<List<ResumeSkill>> getAllByJobSeekerId(@RequestParam int id){
		return this.resumeSkillService.getAllByJobSeekerId(id);
	}
}
