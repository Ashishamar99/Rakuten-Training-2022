package com.fitnesstracker.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fitnesstracker.demo.entities.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer>{

}
