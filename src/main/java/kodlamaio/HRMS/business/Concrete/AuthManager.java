package kodlamaio.HRMS.business.Concrete;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.Abstract.IAuthService;
import kodlamaio.HRMS.business.Abstract.IEmployerService;
import kodlamaio.HRMS.business.Abstract.IJobSeekerService;
import kodlamaio.HRMS.business.Abstract.IUserService;
import kodlamaio.HRMS.business.Abstract.IVerificationService;
import kodlamaio.HRMS.core.utilities.IVerificationUtiliesService;
import kodlamaio.HRMS.entities.Concrete.Employer;
import kodlamaio.HRMS.entities.Concrete.JobSeeker;
import kodlamaio.HRMS.entities.Concrete.Verification;
import kodlamaio.HRMS.core.adapters.IValidationService;
import kodlamaio.HRMS.core.result.ErrorResult;
import kodlamaio.HRMS.core.result.Result;
import kodlamaio.HRMS.core.result.SuccessResult;


@Service
public class AuthManager implements IAuthService{

	private IUserService userService;
	private IEmployerService employerService;
	private IJobSeekerService jobSeekerService;
	private IVerificationService verificationService;
	private IValidationService validationService;
	private IVerificationUtiliesService verificationUtiliService;

	@Autowired
	public AuthManager(IUserService userService, IEmployerService employerService, IJobSeekerService jobSeekerService,
			IVerificationService verificationService, IValidationService validationService,
			IVerificationUtiliesService verificationUtiliService) {
		super();
		this.userService = userService;
		this.employerService = employerService;
		this.jobSeekerService = jobSeekerService;
		this.verificationService = verificationService;
		this.validationService = validationService;
		this.verificationUtiliService = verificationUtiliService;
	}
	
	@Override
	public Result registerEmployer(Employer employer, String confirmPassword) {

		if (!checkIfNullInfoForEmployer(employer)) {

			return new ErrorResult("Lütfen bilgileri eksiksiz olarak giriniz");
		}

		if (!checkIfEqualEmailAndDomain(employer.getEmail(), employer.getWebsite())) {

			return new ErrorResult("Hatalı mail adresi.");
		}

		
		if (!checkIfEqualPasswordAndConfirmPassword(employer.getPassword(), confirmPassword)) {

			return new ErrorResult("Şifre eşleşmiyor.");
		}

		employerService.add(employer);
		String code = verificationUtiliService.sendVerificationCode();
		verificationCode(code, employer.getId(), employer.getEmail());
		return new SuccessResult("Kayıt başarıyla tamamlandı");

	}

	@Override
	public Result registerJobSeeker(JobSeeker jobSeeker, String confirmPassword) {

		if (checkIfRealPerson(jobSeeker.getIdentityNumber(), jobSeeker.getFirstName(), jobSeeker.getLastName(),
				jobSeeker.getBirthDate().getYear()) == false) {
			return new ErrorResult("TCKN doğrulanamadı.");
		}

		if (!checkIfNullInfoForJobSeeker(jobSeeker, confirmPassword)) {

			return new ErrorResult("Lütfen bilgileri eksiksiz doldurunuz.");
		}

		if (!checkIfExistsTcNo(jobSeeker.getIdentityNumber())) {

			return new ErrorResult(jobSeeker.getIdentityNumber() + "TCKN Kullanılıyor.");
		}

		jobSeekerService.Add(jobSeeker);
		String code = verificationUtiliService.sendVerificationCode();
		verificationCode(code, jobSeeker.getId(), jobSeeker.getEmail());
		return new SuccessResult("Kayıt başarıyla tamamlandı");
	}

	private boolean checkIfNullInfoForEmployer(Employer employer) {

		if (employer.getCompanyName() != null && employer.getWebsite() != null && employer.getEmail() != null
				&& employer.getPhoneNumber() != null && employer.getPassword() != null) {

			return true;

		}

		return false;
	}

	private boolean checkIfEqualEmailAndDomain(String email, String webAddress) {
		String[] emailArr = email.split("@", 2);
		String domain = webAddress.substring(4, webAddress.length());

		if (emailArr[1].equals(domain)) {

			return true;
		}

		return false;
	}
	private boolean checkIfNullInfoForJobSeeker(JobSeeker jobSeeker, String confirmPassword) {

		if (jobSeeker.getFirstName() != null && jobSeeker.getLastName() != null && jobSeeker.getIdentityNumber() != null
				&& jobSeeker.getBirthDate() != null && jobSeeker.getPassword() != null && jobSeeker.getEmail() != null
				&& confirmPassword != null) {

			return true;

		}

		return false;
	}

	private boolean checkIfExistsTcNo(String identityNumber) {

		if (this.jobSeekerService.getIdentityNumber(identityNumber).getData() == null) {
			return true;
		}
		return false;
	}

	private boolean checkIfRealPerson(String identityNumber, String firstName, String lastName, int birthDate) {

		if (validationService.validateByMernis(identityNumber, firstName, lastName, birthDate)) {
			return true;
		}
		return false;
	}

	

	private boolean checkIfEqualPasswordAndConfirmPassword(String password, String confirmPassword) {

		if (!password.equals(confirmPassword)) {
			return false;
		}

		return true;
	}

	private void verificationCode(String code, int id, String email) {

		Verification verification = new Verification(id, code, false);
		this.verificationService.add(verification);
		System.out.println("Mailine bak " + email);

	}

}
