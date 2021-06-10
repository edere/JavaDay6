package kodlamaio.HRMS.business.Abstract;

import java.util.List;

import kodlamaio.HRMS.core.result.DataResult;
import kodlamaio.HRMS.core.result.Result;
import kodlamaio.HRMS.entities.Concrete.ResumeLink;

public interface IResumeLinkService {

	Result add(ResumeLink resumeLink);
	Result update(ResumeLink resumeLink);
	Result delete(int id);
    DataResult<ResumeLink> getById(int id);	
	DataResult<List<ResumeLink>> getAllByJobSeekerId(int id);
	DataResult<List<ResumeLink>> getAll();
}
