package kodlamaio.HRMS.business.Abstract;

import java.util.List;

import kodlamaio.HRMS.entities.Concrete.BusinessPositions;

public interface IBusinessService {
	
 List<BusinessPositions> getAll();
}
