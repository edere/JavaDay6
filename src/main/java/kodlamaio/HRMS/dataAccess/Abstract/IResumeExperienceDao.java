package kodlamaio.HRMS.dataAccess.Abstract;

import org.springframework.data.jpa.repository.JpaRepository;
import kodlamaio.HRMS.entities.Concrete.ResumeExperience;

public interface IResumeExperienceDao extends JpaRepository<ResumeExperience, Integer> {

}
