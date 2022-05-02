package com.fitnesstracker.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fitnesstracker.demo.entities.ContactUs;

public interface ContactRepository extends JpaRepository<ContactUs, Integer>{

}
