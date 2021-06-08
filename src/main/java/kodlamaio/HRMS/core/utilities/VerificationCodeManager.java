package kodlamaio.HRMS.core.utilities;

import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
public class VerificationCodeManager implements IVerificationUtiliesService{

	@Override
	public void sendMailLink(String email) {
		UUID uuid = UUID.randomUUID();
		String verificationLink = "https://hrmsverificationmail/" + uuid.toString();
		System.out.println(" Doğrulama mail Linki Gönderildi " + email );
		System.out.println("Linke Tıklayınız " + verificationLink );
	}

	@Override
	public String sendVerificationCode() {
		UUID uuid = UUID.randomUUID();
		String verificationCode = uuid.toString();
		System.out.println("Aktivasyon Kodunuz:  " + verificationCode );
		return verificationCode;
	}

}
