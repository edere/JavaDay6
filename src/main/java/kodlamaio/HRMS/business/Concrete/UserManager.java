package kodlamaio.HRMS.business.Concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.Abstract.IUserService;
import kodlamaio.HRMS.core.result.DataResult;
import kodlamaio.HRMS.core.result.SuccessDataResult;
import kodlamaio.HRMS.dataAccess.Abstract.IUserDao;
import kodlamaio.HRMS.entities.Concrete.Employer;
import kodlamaio.HRMS.entities.Concrete.User;

@Service
public class UserManager implements IUserService{

	private IUserDao userdal;
	@Autowired
	public UserManager(IUserDao userdal) {
		this.userdal = userdal;
	}
	
	@Override
	public void Add() {
		System.out.println("Kullanıcı başarıyla eklendi.");
		
	}

	@Override
	public void delete() {
		System.out.println("Kullanıcı başarıyla silindi.");
		
	}

	@Override
	public void update() {
		System.out.println("Kullanıcı başarıyla güncellendi.");
		
	}

	@Override
	public DataResult<List<User>> getAll() {
		return new SuccessDataResult<List<User>>(this.userdal.findAll());

	}

}
