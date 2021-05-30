package kodlamaio.HRMS.dataAccess.Abstract;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HRMS.entities.Concrete.Employer;

public interface IEmployerDal extends JpaRepository<Employer, Integer>{

}
