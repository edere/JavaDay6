package kodlamaio.HRMS.business.Abstract;

import java.util.List;

import kodlamaio.HRMS.core.result.DataResult;
import kodlamaio.HRMS.core.result.Result;
import kodlamaio.HRMS.entities.Concrete.JobSeeker;

public interface IJobSeekerService {

	public Result Add(JobSeeker joSeeker);

	public void delete();

	public void update();

	public DataResult<List<JobSeeker>> getAll();

	DataResult<JobSeeker> getIdentityNumber(String identityNumber);
}
