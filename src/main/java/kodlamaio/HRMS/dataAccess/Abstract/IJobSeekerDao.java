package kodlamaio.HRMS.dataAccess.Abstract;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HRMS.entities.Concrete.JobSeeker;

public interface IJobSeekerDao extends JpaRepository<JobSeeker, Integer>{

	JobSeeker findByidentityNumber(String identityId);
}
