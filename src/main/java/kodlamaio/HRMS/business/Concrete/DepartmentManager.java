package kodlamaio.HRMS.business.Concrete;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.Abstract.IDepartmentService;
import kodlamaio.HRMS.core.result.DataResult;
import kodlamaio.HRMS.core.result.Result;
import kodlamaio.HRMS.core.result.SuccessDataResult;
import kodlamaio.HRMS.core.result.SuccessResult;
import kodlamaio.HRMS.dataAccess.Abstract.IDepartmentDao;
import kodlamaio.HRMS.entities.Concrete.Department;

@Service
public class DepartmentManager implements IDepartmentService{

	private IDepartmentDao departmentDao;
	@Autowired
	public DepartmentManager(IDepartmentDao departmentDao) {
		super();
		this.departmentDao = departmentDao;
	}
	
	@Override
	public DataResult<List<Department>> getAll() {
		return new SuccessDataResult<List<Department>>
		(this.departmentDao.findAll(), "Departman Başarıyla Listelendi.");
	}

	@Override
	public Result add(Department department) {
		this.departmentDao.save(department);
		return new SuccessResult("Departman Başarıyla Eklendi.");
	}

	@Override
	public Result delete(Department department) {
		this.departmentDao.delete(department);
		return new SuccessResult("Departman Başarıyla Silindi.");
	}

}
