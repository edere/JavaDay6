package kodlamaio.HRMS.business.Concrete;

import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.Abstract.IEmployerCheckService;
import kodlamaio.HRMS.entities.Concrete.Employer;
@Service
public class EmployerCheckManager implements IEmployerCheckService {

	@Override
	public boolean isEmailControl(Employer employer) {
		
		return true;
	}

}
