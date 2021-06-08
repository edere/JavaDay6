package kodlamaio.HRMS.business.Concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.Abstract.IJobAdvertisementService;
import kodlamaio.HRMS.core.result.DataResult;
import kodlamaio.HRMS.core.result.Result;
import kodlamaio.HRMS.core.result.SuccessDataResult;
import kodlamaio.HRMS.core.result.SuccessResult;
import kodlamaio.HRMS.dataAccess.Abstract.IJobAdvertisementDao;
import kodlamaio.HRMS.entities.Concrete.JobAdvertisement;

@Service
public class JobAdvertisementManager implements IJobAdvertisementService {

	private IJobAdvertisementDao jobAdvertisementDao;
	@Autowired
	public JobAdvertisementManager(IJobAdvertisementDao jobAdvertisementDao) {
		super();
		this.jobAdvertisementDao = jobAdvertisementDao;
	}
	
	@Override
	public DataResult<List<JobAdvertisement>> getAll() {
		return new SuccessDataResult<List<JobAdvertisement>>
		(this.jobAdvertisementDao.findAll(),"İşler Listelendi.");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAllActive() {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getAllActive(),"Aktif iş ilanları listelenmiştir.!");
	}

	
	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
       jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("Ekleme başarılı!");
	}

	@Override
	public Result closeTheAdvertisement(int jobAdvertisementId) {
       jobAdvertisementDao.closeTheAdvertisement(jobAdvertisementId);
		
		return new SuccessResult("İlan süresi doldu");
	}

}
