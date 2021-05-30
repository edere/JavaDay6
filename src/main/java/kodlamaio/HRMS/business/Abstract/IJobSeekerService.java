package kodlamaio.HRMS.business.Abstract;

import java.util.List;

import kodlamaio.HRMS.entities.Concrete.JobSeeker;

public interface IJobSeekerService {

public void Add();
	
	public void delete();
	
	public void update();
	
	public List<JobSeeker> getAll();
	
}
