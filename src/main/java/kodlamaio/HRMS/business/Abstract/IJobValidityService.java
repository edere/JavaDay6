package kodlamaio.HRMS.business.Abstract;

public interface IJobValidityService {

	boolean isPositionEmpty(String position);
	boolean isDescriptionEmpty(String description);
	boolean isPositionAlreadyAvailable(String position);
	
}
