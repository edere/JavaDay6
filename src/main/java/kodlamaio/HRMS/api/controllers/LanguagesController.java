package kodlamaio.HRMS.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HRMS.business.Abstract.IResumeLanguageService;
import kodlamaio.HRMS.core.result.DataResult;
import kodlamaio.HRMS.core.result.Result;
import kodlamaio.HRMS.entities.Concrete.ResumeLanguage;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {

	
	private IResumeLanguageService languageService;
	
	@Autowired
	public LanguagesController(IResumeLanguageService languageService) {
		super();
		this.languageService = languageService;
	}
	
	@PostMapping("/add")
	public Result add( @RequestBody ResumeLanguage language){
		return this.languageService.add(language);
		
	}
	
	@PostMapping("/update")
	public Result update( @RequestBody ResumeLanguage language){
		return this.languageService.update(language);
		
	}
	
	@PostMapping("/delete")
	public Result delete( @RequestParam int  id){
		return this.languageService.delete(id);
		
	}
	
	@GetMapping("/getall")
	public DataResult<List<ResumeLanguage>> getAll(){
		return this.languageService.getAll();
	}
	
	@GetMapping("/getAllByCandidateId")
	public DataResult<List<ResumeLanguage>> getAllByCandidateId(@RequestParam int id){
		return this.languageService.getAllByJobSeekerId(id);
	}
}
