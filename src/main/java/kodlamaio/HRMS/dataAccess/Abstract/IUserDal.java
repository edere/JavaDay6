package kodlamaio.HRMS.dataAccess.Abstract;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HRMS.entities.Concrete.User;

public interface IUserDal  extends JpaRepository<User, Integer>{ 

}
