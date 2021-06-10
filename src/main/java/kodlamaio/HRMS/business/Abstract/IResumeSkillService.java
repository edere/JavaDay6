package kodlamaio.HRMS.business.Abstract;

import java.util.List;

import kodlamaio.HRMS.core.result.DataResult;
import kodlamaio.HRMS.core.result.Result;
import kodlamaio.HRMS.entities.Concrete.ResumeSkill;

public interface IResumeSkillService {

	Result add(ResumeSkill resumeSkill);
	Result update(ResumeSkill resumeSkill);
	Result delete(int id);
	DataResult<ResumeSkill> getById(int id);	
	DataResult<List<ResumeSkill>> getAllByJobSeekerId(int id);
	DataResult<List<ResumeSkill>> getAll();
}
