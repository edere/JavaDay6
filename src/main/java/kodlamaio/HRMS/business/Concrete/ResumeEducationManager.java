package kodlamaio.HRMS.business.Concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.Abstract.IResumeEducationService;
import kodlamaio.HRMS.core.result.DataResult;
import kodlamaio.HRMS.core.result.Result;
import kodlamaio.HRMS.core.result.SuccessDataResult;
import kodlamaio.HRMS.core.result.SuccessResult;
import kodlamaio.HRMS.dataAccess.Abstract.IResumeEducationDao;
import kodlamaio.HRMS.entities.Concrete.ResumeEducation;

@Service
public class ResumeEducationManager implements IResumeEducationService {
	private IResumeEducationDao educationDao;

	@Autowired
	public ResumeEducationManager(IResumeEducationDao educationDao) {
		super();
		this.educationDao = educationDao;
	}

	@Override
	public Result add(ResumeEducation education) {
		this.educationDao.save(education);
		return new SuccessResult("Eğitim Bilgisi Başarıyla Eklendi!");
	}

	@Override
	public Result update(ResumeEducation education) {
		this.educationDao.save(education);
		return new SuccessResult("Eğitim Bilgisi Başarıyla Güncellendi!");
	}

	@Override
	public Result delete(int id) {
		this.educationDao.deleteById(id);
		return new SuccessResult("Eğitim Bilginiz Silinmiştir.");
	}

	@Override
	public DataResult<List<ResumeEducation>> getAll() {
		return new SuccessDataResult<List<ResumeEducation>>(this.educationDao.findAll());
	}

	@Override
	public DataResult<ResumeEducation> getById(int id) {
		return new SuccessDataResult<ResumeEducation>(this.educationDao.getById(id));
	}

	@Override
	public DataResult<List<ResumeEducation>> getAllByJobseekerIdOrderByEndedDateDesc(int id) {
		return new SuccessDataResult<List<ResumeEducation>>(
				this.educationDao.getAllByCandidate_idOrderByEndedDateDesc(id));
	}

	@Override
	public DataResult<List<ResumeEducation>> getAllByJobSeekerId(int id) {
		return new SuccessDataResult<List<ResumeEducation>>(this.educationDao.getAllByCandidate_id(id));
	}
}