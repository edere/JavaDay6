package kodlamaio.HRMS.business.Concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.Abstract.IResumeSkillService;
import kodlamaio.HRMS.core.result.DataResult;
import kodlamaio.HRMS.core.result.Result;
import kodlamaio.HRMS.core.result.SuccessDataResult;
import kodlamaio.HRMS.core.result.SuccessResult;
import kodlamaio.HRMS.dataAccess.Abstract.IResumeSkillDao;
import kodlamaio.HRMS.entities.Concrete.ResumeSkill;

@Service
public class ResumeSkillManager implements IResumeSkillService {

private IResumeSkillDao resumeSkillDao;
	
	@Autowired
	public ResumeSkillManager(IResumeSkillDao resumeSkillDao) {
		super();
		this.resumeSkillDao = resumeSkillDao;
	}

	
	@Override
	public Result add(ResumeSkill resumeSkill) {
		this.resumeSkillDao.save(resumeSkill);
		return new SuccessResult("Yetenek Bilgisi Başarıyla Eklenmiştir");
	}

	@Override
	public Result update(ResumeSkill resumeSkill) {
		this.resumeSkillDao.save(resumeSkill);
		return new SuccessResult("Yetenek Bilgileriniz Güncellenmiştir!");
	}

	@Override
	public Result delete(int jobSeekerId) {
		this.resumeSkillDao.deleteById(jobSeekerId);
		return new SuccessResult("Yetenek Bilgileriniz Silindi!");
	}

	@Override
	public DataResult<List<ResumeSkill>> getAllByJobSeekerId(int jobSeekerId) {
		return new SuccessDataResult<List<ResumeSkill>>(this.resumeSkillDao.getAllByCandidate_id(jobSeekerId));
	}

	@Override
	public DataResult<List<ResumeSkill>> getAll() {
		return new SuccessDataResult<List<ResumeSkill>>(this.resumeSkillDao.findAll());
		
	}
	
	@Override
	public DataResult<ResumeSkill> getById(int id) {
		return new SuccessDataResult<ResumeSkill>(this.resumeSkillDao.getById(id));
	}

}
