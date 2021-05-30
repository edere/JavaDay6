package kodlamaio.HRMS.business.Abstract;

import java.util.List;

import kodlamaio.HRMS.entities.Concrete.JobPosition;

public interface IJobPositionService {

	List<JobPosition> getAll();
}
