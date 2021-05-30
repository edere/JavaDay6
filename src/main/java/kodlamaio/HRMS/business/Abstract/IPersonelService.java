package kodlamaio.HRMS.business.Abstract;

import java.util.List;

import kodlamaio.HRMS.entities.Concrete.Personel;

public interface IPersonelService {

public void Add();
	
	public void delete();
	
	public void update();
	
	public List<Personel> getAll();
	
}
