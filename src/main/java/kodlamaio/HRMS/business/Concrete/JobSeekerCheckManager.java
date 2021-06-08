package kodlamaio.HRMS.business.Concrete;

import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.Abstract.IJobSeekerCheckService;
import kodlamaio.HRMS.entities.Concrete.JobSeeker;

@Service
public class JobSeekerCheckManager implements IJobSeekerCheckService {

	@Override
	public boolean isVerified(JobSeeker jobSeeker) {
		
		return false;
	}

}
