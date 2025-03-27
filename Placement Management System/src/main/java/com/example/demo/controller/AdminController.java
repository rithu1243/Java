package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Admin;
import com.example.demo.service.AdminService;

@RestController
public class AdminController {
	
	@Autowired
	public AdminService aser;
	
	@PostMapping("/addad")
	public Admin regAdmin(@RequestBody Admin ad)
	{
	return aser.addAdmin(ad);

    }
	
	@GetMapping("/getad")
	public List<Admin> getAd()
	{
		return aser.getAdmin();
	}
	
	@DeleteMapping("deletead/{id}")
	public void deleteAd(@PathVariable Long id)
	{
		aser.deleteAdmin(id);
	}
	
	@PutMapping("/updatead")
	public Admin updateAd(@RequestBody Admin ad)
	{
		return aser.updateAdmin(ad);
	}
}
