package kodlamaio.HRMS.business.Concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.Abstract.IResumeLinkService;
import kodlamaio.HRMS.core.result.DataResult;
import kodlamaio.HRMS.core.result.Result;
import kodlamaio.HRMS.core.result.SuccessDataResult;
import kodlamaio.HRMS.core.result.SuccessResult;
import kodlamaio.HRMS.dataAccess.Abstract.IResumeLinkDao;
import kodlamaio.HRMS.entities.Concrete.ResumeLink;

@Service
public class ResumeLinkManager implements IResumeLinkService{

	private IResumeLinkDao resumeLinkDao;

	@Autowired
	public ResumeLinkManager(IResumeLinkDao resumeLinkDao) {
		super();
		this.resumeLinkDao = resumeLinkDao;
	}
	
	@Override
	public Result add(ResumeLink resumeLink) {
		this.resumeLinkDao.save(resumeLink);
		return new SuccessResult("Link Eklendi!");
	}

	@Override
	public Result update(ResumeLink resumeLink) {
		this.resumeLinkDao.save(resumeLink);
		return new SuccessResult("Link Güncellendi!");
	}

	@Override
	public Result delete(int jobSeekerId) {
		this.resumeLinkDao.deleteById(jobSeekerId);
		return new SuccessResult("Link Silindi!");
	}

	@Override
	public DataResult<List<ResumeLink>> getAllByJobSeekerId(int jobSeekerId) {
		return new SuccessDataResult<List<ResumeLink>>(this.resumeLinkDao.getAllByCandidate_id(jobSeekerId));
	}

	@Override
	public DataResult<List<ResumeLink>> getAll() {
		return new SuccessDataResult<List<ResumeLink>>(this.resumeLinkDao.findAll());	
	}

	@Override
	public DataResult<ResumeLink> getById(int id) {
		return new SuccessDataResult<ResumeLink>(this.resumeLinkDao.getById(id));
	}

}
