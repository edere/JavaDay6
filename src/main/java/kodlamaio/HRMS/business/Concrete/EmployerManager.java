package kodlamaio.HRMS.business.Concrete;

import java.util.List;

import kodlamaio.HRMS.business.Abstract.IEmployerService;
import kodlamaio.HRMS.dataAccess.Abstract.IEmployerDal;
import kodlamaio.HRMS.entities.Concrete.Employer;

public class EmployerManager implements IEmployerService {

	private IEmployerDal employerDal;
	
	public EmployerManager(IEmployerDal employerDal) {
		this.employerDal = employerDal; 
	}
	@Override
	public void add(Employer employer) {
		
		System.out.println("İşveren başarıyla eklendi.");
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
	public List<Employer> getAll() {
		return this.employerDal.findAll();
	}

}
