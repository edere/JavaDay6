package kodlamaio.HRMS.services;


public class FakeMernis {

	public boolean ValidatePersonal(String identityNumber, String firstName, String lastName, int birthDate)
	{
		System.out.println(firstName + " " + lastName + "  kullanıcısı" + " doğrulandı." );
		return true;
	}
}
