package kodlamaio.HRMS.dataAccess.Abstract;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HRMS.entities.Concrete.ResumeLanguage;

public interface IResumeLanguageDao extends JpaRepository<ResumeLanguage, Integer>{

	ResumeLanguage getById(int id);
	List<ResumeLanguage> getAllByCandidate_id(int id);
}
