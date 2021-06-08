package kodlamaio.HRMS.business.Abstract;

import java.util.List;

import kodlamaio.HRMS.core.result.DataResult;
import kodlamaio.HRMS.core.result.Result;
import kodlamaio.HRMS.entities.Concrete.Employer;

public interface IEmployerService {

	public Result add(Employer employer);

	public void delete();

	public void update();
	
	DataResult<List<Employer>> getAll();
}
