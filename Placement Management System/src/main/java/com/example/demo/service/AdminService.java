package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Admin;
import com.example.demo.repository.Adminrepository;

@Service
public class AdminService {
	
	@Autowired
	public Adminrepository erepo;
	
	public Admin addAdmin(Admin ad)
	{
		return erepo.save(ad);
	}
	
	public List<Admin> getAdmin()
	{
		return erepo.findAll();
	}
	
	public void deleteAdmin(long id)
	{
		erepo.deleteById(id);
	}
	
	public Admin updateAdmin(Admin ad)
	{
		Long id=ad.getId();
		Admin ad1=erepo.findById(id).get();
		ad1.setName(ad.getName());
		return erepo.save(ad);
	}
}
