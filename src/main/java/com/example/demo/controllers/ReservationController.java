package com.example.demo.controllers;

import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dto.ReservationRequest;
import com.example.demo.entities.Flight;
import com.example.demo.entities.Reservation;
import com.example.demo.repos.FlightRepository;
import com.example.demo.service.ReservationService;

@Controller
public class ReservationController {
	
	@Autowired
	FlightRepository flightRepository;
	@Autowired
	ReservationService reservationService;
	
	@RequestMapping(value="showCompleteReservation")
	public String showCompleteReservation(@RequestParam("id") Long flightId, ModelMap modelMap) {
		Optional<Flight> flight = flightRepository.findById(flightId);
		modelMap.addAttribute(flight.get());
		return "completeReservation";
		
	}
	
	@RequestMapping(value="completeReservation")
	public String completeReservation(ReservationRequest request,ModelMap modelMap) {
		Reservation reservation = reservationService.bookFlight(request);
		modelMap.addAttribute("msg", "Reservation created successfully with id"+reservation.getId());
		return "reservationconfirmation";
	}

}
