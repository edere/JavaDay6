package kodlamaio.HRMS.dataAccess.Abstract;

import kodlamaio.HRMS.entities.Concrete.Department;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IDepartmentDao  extends JpaRepository<Department, Integer> {

}
