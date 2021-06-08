package kodlamaio.HRMS.business.Abstract;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.dataAccess.Abstract.IJobDao;
import kodlamaio.HRMS.entities.Concrete.Job;

@Service
public class JobValidityManager implements IJobValidityService {

	private IJobDao jobDao;

	@Autowired
	public JobValidityManager(IJobDao jobDao) {
		super();
		this.jobDao = jobDao;
	}

	@Override
	public boolean isPositionEmpty(String position) {
		if (position.isEmpty()) {
			System.out.println("Pozisyon Adı Boş Geçilemez!");
			return true;
		}

		else {

			return false;

		}
	}

	@Override
	public boolean isDescriptionEmpty(String description) {

		if (description.isEmpty()) {
			System.out.println("Açıklama Alanı Boş Geçilemez!");

			return true;

		} else {

			return false;
		}
	}

	@Override
	public boolean isPositionAlreadyAvailable(String position) {
		for (Job job : this.jobDao.findAll()) {

			if (position.equals(job.getPosition())) {
				System.out.println("Aynı Pozisyon birden fazla eklenemez.");
				return true;
			}
		}
		return false;
	}
}
