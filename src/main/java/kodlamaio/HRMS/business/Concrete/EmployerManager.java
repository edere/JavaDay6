package kodlamaio.HRMS.business.Concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.Abstract.IEmployerService;
import kodlamaio.HRMS.core.result.DataResult;
import kodlamaio.HRMS.core.result.Result;
import kodlamaio.HRMS.core.result.SuccessDataResult;
import kodlamaio.HRMS.core.result.SuccessResult;
import kodlamaio.HRMS.dataAccess.Abstract.IEmployerDao;
import kodlamaio.HRMS.entities.Concrete.Employer;
@Service
public class EmployerManager implements IEmployerService {

	private IEmployerDao employerDao;
	
	@Autowired
	public EmployerManager(IEmployerDao employerDao) {
		this.employerDao=employerDao; 
	}
	@Override
	public Result add(Employer employer) {
		this.employerDao.save(employer);
		return new SuccessResult("İşveren başarıyla eklendi.");
	}

	@Override
	public void delete() {
		System.out.println("İşveren başarıyla silindi.");
		
	}

	@Override
	public void update() {
		System.out.println("İşveren başarıyla güncellendi.");
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll());
	}

}
