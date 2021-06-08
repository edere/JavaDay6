package kodlamaio.HRMS.business.Concrete;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.Abstract.IVerificationService;
import kodlamaio.HRMS.core.result.DataResult;
import kodlamaio.HRMS.core.result.Result;
import kodlamaio.HRMS.core.result.SuccessResult;
import kodlamaio.HRMS.dataAccess.Abstract.IVerificationDao;
import kodlamaio.HRMS.entities.Concrete.Verification;

@Service
public class VerificationManager implements IVerificationService{

	private IVerificationDao verificationDao;
	
	@Autowired
	public VerificationManager(IVerificationDao verificationDao) {
		this.verificationDao = verificationDao;
	}
	
	@Override
	public Result add(Verification verifacation) {
		
		this.verificationDao.save(verifacation);
		return  new SuccessResult("Kaydedildi.");
	}
	


}
