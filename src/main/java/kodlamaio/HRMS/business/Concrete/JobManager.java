package kodlamaio.HRMS.business.Concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.Abstract.IJobService;
import kodlamaio.HRMS.business.Abstract.IJobValidityService;
import kodlamaio.HRMS.core.result.DataResult;
import kodlamaio.HRMS.core.result.ErrorResult;
import kodlamaio.HRMS.core.result.Result;
import kodlamaio.HRMS.core.result.SuccessDataResult;
import kodlamaio.HRMS.core.result.SuccessResult;
import kodlamaio.HRMS.dataAccess.Abstract.IJobDao;
import kodlamaio.HRMS.entities.Concrete.Job;

@Service
public class JobManager implements IJobService {

	private IJobDao jobDao;
	private IJobValidityService jobValidityService;
	
	
    @Autowired	
	public JobManager(IJobDao jobDao, IJobValidityService jobValidityService) {
		super();
		this.jobDao = jobDao;
		this.jobValidityService = jobValidityService;
	}
	
	
	@Override
	public DataResult<List<Job>> getAll() {
		return new SuccessDataResult<List<Job>>(this.jobDao.findAll(),"Tüm İşler Listelendi.");
	}

	@Override
	public Result add(Job job) {
		//Burada validation kontrolünü yapıyoruz.
		if ((!jobValidityService.isPositionEmpty(job.getPosition()))&&
			(!jobValidityService.isDescriptionEmpty(job.getDescription()))&&		
			(!jobValidityService.isPositionAlreadyAvailable(job.getPosition()))	) {
			
			this.jobDao.save(job);
			return new SuccessResult("Ekleme başarılı!");
			
		}		
		return new ErrorResult("Tekrar Deneyiniz!");
	}

}
