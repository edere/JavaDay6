package kodlamaio.HRMS.dataAccess.Abstract;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HRMS.entities.Concrete.BusinessPositions;

public interface IBusinessDao extends JpaRepository<BusinessPositions, Integer> {

}
