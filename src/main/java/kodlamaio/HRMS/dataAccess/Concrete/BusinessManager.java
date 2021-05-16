package kodlamaio.HRMS.dataAccess.Concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kodlamaio.HRMS.business.Abstract.IBusinessService;
import kodlamaio.HRMS.dataAccess.Abstract.IBusinessDao;
import kodlamaio.HRMS.entities.Concrete.BusinessPositions;

public class BusinessManager implements IBusinessService {

	private IBusinessDao businessDao;
	@Autowired
	public BusinessManager(IBusinessDao businessDao) {
		this.businessDao = businessDao;
	}
	
	@Override
	public List<BusinessPositions> getAll() {
		return businessDao.findAll();
	}

}
