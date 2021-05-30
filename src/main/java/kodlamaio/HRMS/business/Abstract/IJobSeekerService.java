package kodlamaio.HRMS.business.Abstract;

import java.util.List;

import kodlamaio.HRMS.core.result.DataResult;
import kodlamaio.HRMS.entities.Concrete.JobSeeker;

public interface IJobSeekerService {

	public void Add(JobSeeker joSeeker);

	public void delete();

	public void update();

	public List<JobSeeker> getAll();

	DataResult<JobSeeker> getIdentityNumber(String identityNumber);
}
