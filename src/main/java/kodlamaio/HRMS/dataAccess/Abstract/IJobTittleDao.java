package kodlamaio.HRMS.dataAccess.Abstract;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HRMS.entities.Concrete.JobTittle;

public interface IJobTittleDao extends JpaRepository<JobTittle, Integer>
{

}
