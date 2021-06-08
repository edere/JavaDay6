package kodlamaio.HRMS.api.controllers;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HRMS.business.Abstract.IJobAdvertisementService;
import kodlamaio.HRMS.core.result.DataResult;
import kodlamaio.HRMS.core.result.Result;
import kodlamaio.HRMS.entities.Concrete.JobAdvertisement;

@RestController
@RequestMapping("/api/jobAdvertisements")
public class JobAdvertisementController {
	private IJobAdvertisementService jobAdvertisementService;

	@Autowired
	public JobAdvertisementController(IJobAdvertisementService jobAdvertisementService) {
		super();
		this.jobAdvertisementService = jobAdvertisementService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobAdvertisement>> getAll(){
		
      return this.jobAdvertisementService.getAll();
	}
	@PostMapping("/add")
	public Result add(@RequestBody JobAdvertisement jobAdvertisement) {
		
		return this.jobAdvertisementService.add(jobAdvertisement);
	}
	
	@GetMapping("/getAllActive")
	public DataResult<List<JobAdvertisement>> getAllActive(){
		
		return this.jobAdvertisementService.getAllActive();
	}
	@PostMapping("/closeTheAdvertisement")
	@Transactional
	public Result closeTheAdvertisement(@RequestParam int jobAdvertisementId) {
		return this.jobAdvertisementService.closeTheAdvertisement(jobAdvertisementId);
	}
	
}
