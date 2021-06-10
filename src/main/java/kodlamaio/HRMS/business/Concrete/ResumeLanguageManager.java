package kodlamaio.HRMS.business.Concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.Abstract.IResumeLanguageService;
import kodlamaio.HRMS.core.result.DataResult;
import kodlamaio.HRMS.core.result.Result;
import kodlamaio.HRMS.core.result.SuccessDataResult;
import kodlamaio.HRMS.core.result.SuccessResult;
import kodlamaio.HRMS.dataAccess.Abstract.IResumeLanguageDao;
import kodlamaio.HRMS.entities.Concrete.ResumeLanguage;


@Service
public class ResumeLanguageManager implements IResumeLanguageService{

	private IResumeLanguageDao languageDao;
	
	@Autowired
	public ResumeLanguageManager(IResumeLanguageDao languageDao) {
		super();
		this.languageDao = languageDao;
	}
	
	
	@Override
	public Result add(ResumeLanguage language) {
		this.languageDao.save(language);
		return new SuccessResult("Yabancı Dil Eklendi");
	}

	@Override
	public Result update(ResumeLanguage language) {
		this.languageDao.save(language);
		return new SuccessResult("Yabancı Dil Bilgileriniz Güncellendi");
	}

	@Override
	public Result delete(int id) {
		this.languageDao.deleteById(id);
		return new SuccessResult("Yabancı Dil Bilgisi Silindi");
	}

	@Override
	public DataResult<ResumeLanguage> getById(int id) {
		return new SuccessDataResult<ResumeLanguage>(this.languageDao.getById(id));
	}

	@Override
	public DataResult<List<ResumeLanguage>> getAll() {
		return new SuccessDataResult<List<ResumeLanguage>>(this.languageDao.findAll());
	}

	@Override
	public DataResult<List<ResumeLanguage>> getAllByJobSeekerId(int id) {
		return new SuccessDataResult<List<ResumeLanguage>>(this.languageDao.getAllByCandidate_id(id));
	}

}
