package kodlamaio.HRMS.business.Abstract;

import java.util.List;

import kodlamaio.HRMS.entities.Concrete.Employer;

public interface IEmployerService {

	public void add();

	public void delete();

	public void update();
	
	public List<Employer> getAll();
}
