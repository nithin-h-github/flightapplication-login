package com.example.demo.dto;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Flight;
import com.example.demo.entities.Passenger;
import com.example.demo.entities.Reservation;
import com.example.demo.repos.FlightRepository;
import com.example.demo.repos.PassengerRepository;
import com.example.demo.repos.ReservationRepository;
import com.example.demo.service.ReservationService;

@Service
public class ReservationServiceImpl implements ReservationService {

	@Autowired
	FlightRepository flightRepository;

	@Autowired
	PassengerRepository passengerRepository;

	@Autowired
	ReservationRepository reservationRepository;

	@Override
	public Reservation bookFlight(ReservationRequest reservationRequest) {

		long flightId = reservationRequest.getFlightId();
		Optional<Flight> flight = flightRepository.findById(flightId);

		Passenger passenger = new Passenger();
		passenger.setFirstName(reservationRequest.getPassengerFirstName());
		passenger.setLastName(reservationRequest.getPassengerLastName());
		passenger.setEmail(reservationRequest.getPassengerEmail());
		passenger.setPhone(reservationRequest.getPassengerPhone());
		Passenger savedPassenger = passengerRepository.save(passenger);

		Reservation reservation = new Reservation();
		reservation.setFlightid(flight.get().getId());
		reservation.setPassenger(passenger.getId());
		reservation.setCheckedIn(false);
		Reservation savedReservation = reservationRepository.save(reservation);
		return savedReservation;
	}

}
