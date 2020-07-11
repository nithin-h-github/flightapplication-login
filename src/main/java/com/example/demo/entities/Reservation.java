package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Reservation extends AbstractEntity{

	@Column(name="checked_in")
	private Boolean checkedIn;
	@Column(name="number_of_bags")
	private int numberOfBags;
	@Column(name="passenger_id")
	private long passenger;
	@Column(name="flight_id")
	private long flightid;

//	@Autowired
//	private Flight flight;

	public Boolean getCheckedIn() {
		return checkedIn;
	}

	public void setCheckedIn(Boolean checkedIn) {
		this.checkedIn = checkedIn;
	}

	public int getNumberOfBags() {
		return numberOfBags;
	}

	public void setNumberOfBags(int numberOfBags) {
		this.numberOfBags = numberOfBags;
	}

	public long getPassenger() {
		return passenger;
	}

	public void setPassenger(long passenger) {
		this.passenger = passenger;
	}

//	public Flight getFlight() {
//		return flight;
//	}
//
//	public void setFlight(Flight flight) {
//		this.flight = flight;
//	}
	
	public long getFlightid() {
		return flightid;
	}
//
	public void setFlightid(long flightid) {
		this.flightid = flightid;
	}

}
