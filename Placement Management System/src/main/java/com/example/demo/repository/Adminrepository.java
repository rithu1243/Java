package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Admin;

public interface Adminrepository extends JpaRepository<Admin , Long>
{

}
