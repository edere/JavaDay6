package kodlamaio.HRMS.dataAccess.Abstract;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HRMS.entities.Concrete.ResumeLink;

public interface IResumeLinkDao extends JpaRepository<ResumeLink, Integer> {

	ResumeLink getById(int id);
	List<ResumeLink> getAllByCandidate_id(int id);
}
