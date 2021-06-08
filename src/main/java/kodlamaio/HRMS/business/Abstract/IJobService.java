package kodlamaio.HRMS.business.Abstract;

import java.util.List;

import kodlamaio.HRMS.core.result.DataResult;
import kodlamaio.HRMS.core.result.Result;
import kodlamaio.HRMS.entities.Concrete.Job;

public interface IJobService {

	DataResult<List<Job>> getAll();
	Result add(Job job);
}
