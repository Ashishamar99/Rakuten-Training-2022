package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.ContactUs;

public interface ContactRepository extends JpaRepository<ContactUs, Integer>{

}
