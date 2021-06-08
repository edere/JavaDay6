package kodlamaio.HRMS.business.Concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.Abstract.ICityService;
import kodlamaio.HRMS.core.result.DataResult;
import kodlamaio.HRMS.core.result.Result;
import kodlamaio.HRMS.core.result.SuccessDataResult;
import kodlamaio.HRMS.core.result.SuccessResult;
import kodlamaio.HRMS.dataAccess.Abstract.ICityDao;
import kodlamaio.HRMS.entities.Concrete.City;

@Service
public class CityManager implements ICityService{

	private ICityDao cityDao;
	
	@Autowired
	public CityManager(ICityDao cityDao) {
		super();
		this.cityDao = cityDao;
	}
	@Override
	public DataResult<List<City>> getAll() {
		
		return new SuccessDataResult<List<City>>(this.cityDao.findAll(),"Şehirler Listelendi.");
	}

	@Override
	public Result add(City city) {
		
        cityDao.save(city);
		return new SuccessResult("Şehir başarıyla eklendi.");
	}

}
