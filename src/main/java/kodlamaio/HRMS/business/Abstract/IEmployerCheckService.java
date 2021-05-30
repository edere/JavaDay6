package kodlamaio.HRMS.business.Abstract;

import kodlamaio.HRMS.entities.Concrete.Employer;

public interface IEmployerCheckService {

	public boolean isEmailControl(Employer employer);
}
