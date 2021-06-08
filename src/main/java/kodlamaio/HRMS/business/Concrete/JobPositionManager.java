package kodlamaio.HRMS.business.Concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.Abstract.IJobPositionService;
import kodlamaio.HRMS.dataAccess.Abstract.IJobPositionDao;
import kodlamaio.HRMS.entities.Concrete.JobPosition;

@Service
public class JobPositionManager implements IJobPositionService {

	private IJobPositionDao jobPositionDao;
	
	@Autowired
	public JobPositionManager(IJobPositionDao jobPositionDao) {
	
		this.jobPositionDao=jobPositionDao;
	}
	
	@Override
	public List<JobPosition> getAll() {
		
		return this.jobPositionDao.findAll();
	}

}
