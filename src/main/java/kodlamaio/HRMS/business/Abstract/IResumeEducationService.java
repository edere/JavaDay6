package kodlamaio.HRMS.business.Abstract;

import java.util.List;

import kodlamaio.HRMS.core.result.DataResult;
import kodlamaio.HRMS.core.result.Result;
import kodlamaio.HRMS.entities.Concrete.ResumeEducation;

public interface IResumeEducationService {

	Result add (ResumeEducation education);	
	Result update(ResumeEducation education);
	Result delete(int id);
	DataResult<List<ResumeEducation>> getAll();
	DataResult<ResumeEducation> getById(int id);
	DataResult<List<ResumeEducation>> getAllByJobseekerIdOrderByEndedDateDesc(int id);
	DataResult<List<ResumeEducation>> getAllByJobSeekerId(int id);
}
