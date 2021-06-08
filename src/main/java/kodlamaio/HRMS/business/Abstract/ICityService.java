package kodlamaio.HRMS.business.Abstract;

import java.util.List;

import kodlamaio.HRMS.core.result.DataResult;
import kodlamaio.HRMS.core.result.Result;
import kodlamaio.HRMS.entities.Concrete.City;

public interface ICityService {
	DataResult<List<City>> getAll();
	Result add(City city);
}
