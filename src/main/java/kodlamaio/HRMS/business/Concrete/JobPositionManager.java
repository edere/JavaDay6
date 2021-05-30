package kodlamaio.HRMS.business.Concrete;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.Abstract.IJobPositionService;
import kodlamaio.HRMS.dataAccess.Abstract.IJobPositionDal;
import kodlamaio.HRMS.entities.Concrete.JobPosition;

@Service
public class JobPositionManager implements IJobPositionService {

	private IJobPositionDal jobPositionDal;
	
	public JobPositionManager(IJobPositionDal jobPositionDal) {
	
		this.jobPositionDal=jobPositionDal;
	}
	
	@Override
	public List<JobPosition> getAll() {
		
		return this.jobPositionDal.findAll();
	}

}
