package kodlamaio.HRMS.dataAccess.Abstract;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HRMS.entities.Concrete.Personel;

public interface IPersonelDao  extends JpaRepository<Personel, Integer>{

}
