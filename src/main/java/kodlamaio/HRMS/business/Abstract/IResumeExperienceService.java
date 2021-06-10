package kodlamaio.HRMS.business.Abstract;

import java.util.List;

import kodlamaio.HRMS.core.result.DataResult;
import kodlamaio.HRMS.core.result.Result;
import kodlamaio.HRMS.entities.Concrete.ResumeExperience;

public interface IResumeExperienceService {

	Result add(ResumeExperience resumeExperience);
	Result update(ResumeExperience resumeExperience);
	Result delete(int id);
	DataResult<ResumeExperience> getById(int id);
	DataResult<List<ResumeExperience>> getAll();
	DataResult<List<ResumeExperience>> getAllByJobSeekerId(int jobSeekerId);
	DataResult<List<ResumeExperience>>  getAllByJobSeekerIdOrderByDesc(int id);
}
