package kodlamaio.HRMS.business.Concrete;

import java.util.List;

import kodlamaio.HRMS.business.Abstract.IUserService;
import kodlamaio.HRMS.dataAccess.Abstract.IUserDal;
import kodlamaio.HRMS.entities.Concrete.User;

public class UserManager implements IUserService{

	private IUserDal userdal;
	public UserManager(IUserDal userdal) {
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
	public List<User> getAll() {
		
		return this.userdal.findAll();
	}

}
