package kodlamaio.HRMS.dataAccess.Abstract;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HRMS.entities.Concrete.ResumeSkill;

public interface IResumeSkillDao  extends JpaRepository<ResumeSkill, Integer>{

	ResumeSkill getById(int id);
	List<ResumeSkill> getAllByCandidate_id(int id);
}
