package com.fitnesstracker.demo.mapper;

import java.util.Optional;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.springframework.stereotype.Service;

import com.fitnesstracker.demo.entities.Appointment;
import com.fitnesstracker.demo.entities.AppointmentDTO;

@Mapper(componentModel = "spring")
public interface AppointmentMapper {
	@BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
	static void updateAppointmentFromDTO(Appointment dto, @MappingTarget Optional<Appointment> entity) {}

}
