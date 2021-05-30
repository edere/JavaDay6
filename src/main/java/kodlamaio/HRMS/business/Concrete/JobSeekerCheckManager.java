package kodlamaio.HRMS.business.Concrete;

import kodlamaio.HRMS.business.Abstract.IJobSeekerCheckService;
import kodlamaio.HRMS.entities.Concrete.JobSeeker;

public class JobSeekerCheckManager implements IJobSeekerCheckService {

	@Override
	public boolean isVerified(JobSeeker jobSeeker) {
		
		return false;
	}

}
