package kodlamaio.HRMS.business.Abstract;

import kodlamaio.HRMS.entities.Concrete.JobSeeker;

public interface IJobSeekerCheckService {

	public boolean isVerified(JobSeeker jobSeeker);
}
