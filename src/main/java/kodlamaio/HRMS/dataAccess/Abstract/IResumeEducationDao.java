package kodlamaio.HRMS.dataAccess.Abstract;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import kodlamaio.HRMS.entities.Concrete.ResumeEducation;

public interface IResumeEducationDao extends JpaRepository<ResumeEducation, Integer>{
	
	ResumeEducation getById(int id);
	List<ResumeEducation> getAllByCandidate_idOrderByEndedDateDesc(int id);
	List<ResumeEducation> getAllByCandidate_id(int id);
}
