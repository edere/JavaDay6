package kodlamaio.HRMS.business.Abstract;


import kodlamaio.HRMS.core.result.Result;
import kodlamaio.HRMS.entities.Concrete.Employer;
import kodlamaio.HRMS.entities.Concrete.JobSeeker;

public interface IAuthService {

	Result registerEmployer(Employer employer, String confirmPassword);
	Result registerJobSeeker(JobSeeker jobSeeker, String confirmPassword);

}
