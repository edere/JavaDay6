package kodlamaio.HRMS.core.adapters;

import kodlamaio.HRMS.services.FakeMernis;

public class MernisService implements IValidationService{

	@Override
	public boolean validateByMernis(String identityNumber, String firstName, String lastName, int birthdate) {
       
		FakeMernis client = new FakeMernis();
		
		boolean result = true;
		try {
			result = client.ValidatePersonal(identityNumber, firstName, lastName, birthdate);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
}
