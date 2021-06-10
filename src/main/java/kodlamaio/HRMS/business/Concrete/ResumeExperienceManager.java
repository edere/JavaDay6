package kodlamaio.HRMS.business.Concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.Abstract.IResumeExperienceService;
import kodlamaio.HRMS.core.result.DataResult;
import kodlamaio.HRMS.core.result.Result;
import kodlamaio.HRMS.core.result.SuccessDataResult;
import kodlamaio.HRMS.core.result.SuccessResult;
import kodlamaio.HRMS.dataAccess.Abstract.IResumeExperienceDao;
import kodlamaio.HRMS.entities.Concrete.ResumeExperience;

@Service
public class ResumeExperienceManager implements IResumeExperienceService {

private IResumeExperienceDao jobExperienceDao;
	
	@Autowired
	public ResumeExperienceManager(IResumeExperienceDao jobExperienceDao) {
		super();
		this.jobExperienceDao = jobExperienceDao;
	}

	@Override
	public Result add(ResumeExperience resumeExperience) {
		this.jobExperienceDao.save(resumeExperience);
		return new SuccessResult("İş Deneyimi Eklendi");
	}

	@Override
	public Result update(ResumeExperience resumeExperience) {
		this.jobExperienceDao.save(resumeExperience);
		return new SuccessResult("İş Deneyimi Güncellendi");
	}

	@Override
	public Result delete(int id) {
		this.jobExperienceDao.deleteById(id);
		return new SuccessResult("İş Deneyimi Silindi");
	}

	@Override
	public DataResult<ResumeExperience> getById(int id) {
		return new SuccessDataResult<ResumeExperience>(this.jobExperienceDao.getById(id));
	}

	@Override
	public DataResult<List<ResumeExperience>> getAll() {
		return new SuccessDataResult<List<ResumeExperience>>(this.jobExperienceDao.findAll());		
	}

	@Override
	public DataResult<List<ResumeExperience>> getAllByJobSeekerId(int jobSeekerId) {
		return new SuccessDataResult<List<ResumeExperience>>(this.jobExperienceDao.getAllByCandidate_id(jobSeekerId));
	}

	@Override
	public DataResult<List<ResumeExperience>> getAllByJobSeekerIdOrderByDesc(int id) {
		return new SuccessDataResult<List<ResumeExperience>>(this.jobExperienceDao.getAllByCandidate_idOrderByEndedDateDesc(id));
	}
	
}
