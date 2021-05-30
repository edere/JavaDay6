package kodlamaio.HRMS.business.Concrete;

import java.util.List;


import kodlamaio.HRMS.business.Abstract.IPersonelService;
import kodlamaio.HRMS.dataAccess.Abstract.IPersonelDal;
import kodlamaio.HRMS.entities.Concrete.Personel;

public class PersonelManager implements IPersonelService{

	private IPersonelDal personelDal;
	
	public PersonelManager(IPersonelDal personelDal) {
		this.personelDal = personelDal;
	}

	@Override
	public void Add() {
		System.out.println("Personel başarıyla eklendi.");
	}
		

	@Override
	public void delete() {
		System.out.println("Personel başarıyla silindi.");
	}

	@Override
	public void update() {
		System.out.println("Personel başarıyla güncellendi.");
		
	}

	@Override
	public List<Personel> getAll() {
		return this.personelDal.findAll();
	}
}