package kodlamaio.HRMS.business.Concrete;

import org.springframework.beans.factory.annotation.Autowired;



import kodlamaio.HRMS.business.Abstract.IVerificationService;
import kodlamaio.HRMS.core.result.DataResult;
import kodlamaio.HRMS.core.result.Result;
import kodlamaio.HRMS.core.result.SuccessResult;
import kodlamaio.HRMS.dataAccess.Abstract.IVerificationDal;
import kodlamaio.HRMS.entities.Concrete.Verification;

public class VerificationManager implements IVerificationService{

	private IVerificationDal verificationDal;
	
	@Autowired
	public VerificationManager(IVerificationDal verificationDal) {
		this.verificationDal = verificationDal;
	}
	
	@Override
	public Result add(Verification verifacation) {
		
		this.verificationDal.save(verifacation);
		return  new SuccessResult("Kaydedildi.");
	}
	


}
