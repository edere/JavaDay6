package kodlamaio.HRMS.business.Abstract;

import java.util.List;

import kodlamaio.HRMS.entities.Concrete.JobTittle;

public interface IJobTitleService {
	List<JobTittle> getAll();
}
