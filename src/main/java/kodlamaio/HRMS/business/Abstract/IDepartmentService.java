package kodlamaio.HRMS.business.Abstract;

import java.util.List;

import kodlamaio.HRMS.core.result.DataResult;
import kodlamaio.HRMS.core.result.Result;
import kodlamaio.HRMS.entities.Concrete.Department;

public interface IDepartmentService {

	public DataResult<List<Department>> getAll();
	public Result add(Department department);
	public Result delete(Department department);
}
