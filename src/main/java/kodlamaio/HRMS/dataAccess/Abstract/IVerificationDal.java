package kodlamaio.HRMS.dataAccess.Abstract;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HRMS.entities.Concrete.Verification;

public interface IVerificationDal extends JpaRepository<Verification, Integer>{

}
