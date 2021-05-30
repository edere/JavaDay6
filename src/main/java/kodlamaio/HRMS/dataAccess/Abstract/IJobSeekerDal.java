package kodlamaio.HRMS.dataAccess.Abstract;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HRMS.entities.Concrete.JobSeeker;

public interface IJobSeekerDal extends JpaRepository<JobSeeker, Integer>{

}
