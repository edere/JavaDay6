package kodlamaio.HRMS.business.Concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.Abstract.IPersonelService;
import kodlamaio.HRMS.dataAccess.Abstract.IPersonelDao;
import kodlamaio.HRMS.entities.Concrete.Personel;

@Service
public class PersonelManager implements IPersonelService{

	private IPersonelDao personelDao;
	
	@Autowired
	public PersonelManager(IPersonelDao personelDao) {
		this.personelDao = personelDao;
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
		return this.personelDao.findAll();
	}
}