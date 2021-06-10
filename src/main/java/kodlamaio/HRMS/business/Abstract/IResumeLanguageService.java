package kodlamaio.HRMS.business.Abstract;

import java.util.List;

import kodlamaio.HRMS.core.result.DataResult;
import kodlamaio.HRMS.core.result.Result;
import kodlamaio.HRMS.entities.Concrete.ResumeLanguage;

public interface IResumeLanguageService {


	Result add(ResumeLanguage language);
	Result update(ResumeLanguage language);
	Result delete(int id);
	DataResult<ResumeLanguage> getById(int id);
	DataResult<List<ResumeLanguage>>  getAll();
	DataResult<List<ResumeLanguage>>  getAllByJobSeekerId(int id);
}
