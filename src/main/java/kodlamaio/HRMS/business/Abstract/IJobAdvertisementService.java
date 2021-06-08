package kodlamaio.HRMS.business.Abstract;

import java.util.List;

import kodlamaio.HRMS.core.result.DataResult;
import kodlamaio.HRMS.core.result.Result;
import kodlamaio.HRMS.entities.Concrete.JobAdvertisement;

public interface IJobAdvertisementService {
	
	 DataResult<List<JobAdvertisement>> getAll();
		
	 DataResult<List<JobAdvertisement>> getAllActive();
	 
	 Result add(JobAdvertisement jobAdvertisement);
	 
	 Result closeTheAdvertisement(int jobAdvertisementId);
}
