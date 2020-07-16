package com.example.demo.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ReservationUpdateRequest;
import com.example.demo.entities.Reservation;
import com.example.demo.repos.ReservationRepository;

@RestController
@CrossOrigin
public class ReservationRestController {
	
	@Autowired
	ReservationRepository reservationRepository;
	
	@RequestMapping("reservations/{id}")
	public Optional<Reservation> findReservation(@PathVariable("id") Long id) {
		return reservationRepository.findById(id);
		
	}
	
	@RequestMapping("reservations")
	public Reservation reservationUpdateRequest(@RequestBody ReservationUpdateRequest request) {
		Optional<Reservation> reservation = reservationRepository.findById(request.getId());
		reservation.get().setNumberOfBags(request.getNumberOfBags());
		reservation.get().setCheckedIn(request.getCheckedIn());
		reservationRepository.save(reservation.get());
		return null;
		
	}
}
