package kodlamaio.HRMS.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HRMS.business.Abstract.ICityService;
import kodlamaio.HRMS.core.result.DataResult;
import kodlamaio.HRMS.core.result.Result;
import kodlamaio.HRMS.entities.Concrete.City;

@RestController
@RequestMapping("/api/city")
public class CityController {

	private ICityService cityService;

	@Autowired
	public CityController(ICityService cityService) {
		super();
		this.cityService = cityService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<City>> getAll(){
		
      return this.cityService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody City city) {
		
		return this.cityService.add(city);
	}
	
	
}
