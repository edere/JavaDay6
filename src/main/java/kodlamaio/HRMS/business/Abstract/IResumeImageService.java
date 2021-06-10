package kodlamaio.HRMS.business.Abstract;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import kodlamaio.HRMS.core.result.DataResult;
import kodlamaio.HRMS.core.result.Result;
import kodlamaio.HRMS.entities.Concrete.ResumeImage;

public interface IResumeImageService {

	Result add(ResumeImage resumeImage, MultipartFile imageFile);
	Result update(ResumeImage resumeImage);
	Result delete(int id);
	DataResult<ResumeImage> getById(int id);	
	DataResult<List<ResumeImage>> getAll();
	DataResult<ResumeImage> getByJobSeekerId(int id);
}
