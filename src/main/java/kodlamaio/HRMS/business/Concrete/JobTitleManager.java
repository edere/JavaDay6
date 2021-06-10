package kodlamaio.HRMS.business.Concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.Abstract.IJobTitleService;
import kodlamaio.HRMS.dataAccess.Abstract.IJobTittleDao;
import kodlamaio.HRMS.entities.Concrete.JobTittle;

@Service
public class JobTitleManager implements IJobTitleService{

	private IJobTittleDao jobTittleDao;
	
	@Autowired
	public JobTitleManager(IJobTittleDao jobTittleDao) {
		this.jobTittleDao  = jobTittleDao;
	}
	
	@Override
	public List<JobTittle> getAll() {
		return jobTittleDao.findAll();
	} 

}
