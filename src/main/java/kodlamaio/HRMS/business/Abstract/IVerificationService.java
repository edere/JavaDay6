package kodlamaio.HRMS.business.Abstract;


import org.springframework.stereotype.Service;

import kodlamaio.HRMS.core.result.Result;
import kodlamaio.HRMS.entities.Concrete.Verification;


public interface IVerificationService {

	Result add(Verification verifacation);
}
