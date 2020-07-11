package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.dto.ReservationRequest;
import com.example.demo.entities.Reservation;

@Service
public interface ReservationService {
	public Reservation bookFlight(ReservationRequest reservationRequest);
}
