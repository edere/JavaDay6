package kodlamaio.HRMS.business.Concrete;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.Abstract.IJobSeekerService;
import kodlamaio.HRMS.core.result.DataResult;
import kodlamaio.HRMS.core.result.Result;
import kodlamaio.HRMS.core.result.SuccessDataResult;
import kodlamaio.HRMS.core.result.SuccessResult;
import kodlamaio.HRMS.dataAccess.Abstract.IJobSeekerDao;
import kodlamaio.HRMS.entities.Concrete.JobSeeker;

@Service
public class JobSeekerManager implements IJobSeekerService {

	private IJobSeekerDao jobSeekerDao;
	
	@Autowired
	public JobSeekerManager(IJobSeekerDao jobSeekerDao) {
		this.jobSeekerDao =jobSeekerDao;
	}
	
	@Override
	public 	Result Add(JobSeeker jobSeeker) {
		this.jobSeekerDao.save(jobSeeker);
		return new SuccessResult("Kullanıcı başarıyla eklendi.");
		
	}

	@Override
	public void delete() {
		System.out.println("Kullanıcı başarıyla silindi.");
		
	}

	@Override
	public void update() {
		System.out.println("Kullanıcı başarıyla güncellendi.");
		
	}

	@Override
	public DataResult<List<JobSeeker>> getAll() {
		
		return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.findAll());
	}


	@Override
	public DataResult<JobSeeker> getIdentityNumber(String identityNumber) {
		
		return new SuccessDataResult<JobSeeker>(this.jobSeekerDao.findByidentityNumber(identityNumber));
	}

	@Override
	public DataResult<JobSeeker> getById(int id) {
		return new SuccessDataResult<JobSeeker>(this.jobSeekerDao.getById(id));
	}

}
