package kodlamaio.HRMS.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import kodlamaio.HRMS.business.Abstract.IJobSeekerService;
import kodlamaio.HRMS.business.Abstract.IResumeImageService;
import kodlamaio.HRMS.core.result.DataResult;
import kodlamaio.HRMS.core.result.Result;
import kodlamaio.HRMS.entities.Concrete.JobSeeker;
import kodlamaio.HRMS.entities.Concrete.ResumeImage;

@RestController
@RequestMapping("/api/images")
public class ImageController {

	private IResumeImageService resumeImageService;
	private IJobSeekerService jobSeekerService;
	
	@Autowired
	public ImageController(IResumeImageService resumeImageService,IJobSeekerService jobSeekerService) {
		super();
		this.resumeImageService = resumeImageService;
		this.jobSeekerService = jobSeekerService;
	}

	
	@PostMapping(value = "/add")
	public Result add(@RequestParam(value = "id") int id, @RequestParam(value = "imageFile") MultipartFile imageFile){
		JobSeeker candidate = this.jobSeekerService.getById(id).getData();
		ResumeImage resumeImage = new ResumeImage();
		resumeImage.setCandidate(candidate);
		return this.resumeImageService.add(resumeImage, imageFile);
	}
	
	@PostMapping("/update")
	public Result update( @RequestBody ResumeImage resumeImage){
		return this.resumeImageService.update(resumeImage);
		
	}
	
	@PostMapping("/delete")
	public Result delete( @RequestParam int  id){
		return this.resumeImageService.delete(id);
		
	}
	
	@GetMapping("/getall")
	public DataResult<List<ResumeImage>> getAll(){
		return this.resumeImageService.getAll();
	}
	
	@GetMapping("/getAllByCandidateId")
	public DataResult<ResumeImage> getByCandidateId(@RequestParam int id){
		return this.resumeImageService.getByJobSeekerId(id);
	}
	
	@GetMapping("/getById")
	public DataResult<ResumeImage> getById(@RequestParam int id){
		return this.resumeImageService.getById(id);
	}
}
