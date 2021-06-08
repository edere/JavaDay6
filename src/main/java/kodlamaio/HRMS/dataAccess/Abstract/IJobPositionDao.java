package kodlamaio.HRMS.dataAccess.Abstract;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HRMS.entities.Concrete.JobPosition;

public interface IJobPositionDao extends JpaRepository<JobPosition, Integer> {
	
}
