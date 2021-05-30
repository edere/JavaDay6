package kodlamaio.HRMS.business.Concrete;

import kodlamaio.HRMS.business.Abstract.IEmployerCheckService;
import kodlamaio.HRMS.entities.Concrete.Employer;

public class EmployerCheckManager implements IEmployerCheckService {

	@Override
	public boolean isEmailControl(Employer employer) {
		
		return true;
	}

}
