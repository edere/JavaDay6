package kodlamaio.HRMS.business.Abstract;

import java.util.List;

import kodlamaio.HRMS.entities.Concrete.User;

public interface IUserService {

	public void Add();
	
	public void delete();
	
	public void update();
	
	public List<User> getAll();
	
}

