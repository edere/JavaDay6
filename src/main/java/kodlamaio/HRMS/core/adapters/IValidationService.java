package kodlamaio.HRMS.core.adapters;

public interface IValidationService {
	boolean validateByMernis(String identityNumber, String firstName, String lastName, int birthdate);
}
