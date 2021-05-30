package kodlamaio.HRMS.business.Concrete;

import java.util.List;

import kodlamaio.HRMS.business.Abstract.IJobSeekerService;
import kodlamaio.HRMS.core.result.DataResult;
import kodlamaio.HRMS.core.result.SuccessDataResult;
import kodlamaio.HRMS.dataAccess.Abstract.IJobSeekerDal;
import kodlamaio.HRMS.entities.Concrete.JobSeeker;

public class JobSeekerManager implements IJobSeekerService {

	private IJobSeekerDal jobSeekerDal;
	
	public JobSeekerManager(IJobSeekerDal jobSeekerDal) {
		this.jobSeekerDal =jobSeekerDal;
	}
	
	@Override
	public void Add(JobSeeker jobSeeker) {
		System.out.println("Kullanıcı başarıyla eklendi.");
		
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
	public List<JobSeeker> getAll() {
		
		return this.jobSeekerDal.findAll();
	}


	@Override
	public DataResult<JobSeeker> getIdentityNumber(String identityNumber) {
		
		return new SuccessDataResult<JobSeeker>(this.jobSeekerDal.findByidentityNumber(identityNumber));
	}

}
