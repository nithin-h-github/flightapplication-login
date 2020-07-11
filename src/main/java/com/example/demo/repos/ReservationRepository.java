package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Flight;
import com.example.demo.entities.Reservation;
import com.example.demo.entities.User;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
	


}
