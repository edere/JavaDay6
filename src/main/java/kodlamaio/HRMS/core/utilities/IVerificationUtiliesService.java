package kodlamaio.HRMS.core.utilities;

public interface IVerificationUtiliesService {

	void sendMailLink(String email);
	String sendVerificationCode();
}
