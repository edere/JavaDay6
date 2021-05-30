package kodlamaio.HRMS.dataAccess.Abstract;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HRMS.entities.Concrete.JobPosition;

public interface IJobPositionDal extends JpaRepository<JobPosition, Integer> {
	
}
