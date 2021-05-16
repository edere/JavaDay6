package kodlamaio.HRMS.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HRMS.business.Abstract.IBusinessService;
import kodlamaio.HRMS.entities.Concrete.BusinessPositions;

@RestController
@RequestMapping("/api/BusinessPosition")
public class BusinessPositionController {

	private IBusinessService businessService;
	
	@Autowired
	public BusinessPositionController(IBusinessService businessService) {
		this.businessService = businessService;
	}
	
	@GetMapping("/getall")
	public List<BusinessPositions> getAll(){
		return businessService.getAll();
	}
}
