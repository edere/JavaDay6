package kodlamaio.HRMS.dataAccess.Abstract;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HRMS.entities.Concrete.ResumeImage;

public interface IResumeImageDao extends JpaRepository<ResumeImage, Integer> {

	ResumeImage getByCandidate_id(int id);
	ResumeImage getById(int id);
}
