package com.Flight_Checkin.Integration;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.Flight_Checkin.Integration.Dto.Reservation;
import com.Flight_Checkin.Integration.Dto.ReservationUpdateRequest;
@Component
public class ReservationRestfulClientImpl implements ReservationRestfulClient {

	@Override
	public Reservation findReservation(Long id) {
		RestTemplate restTemplate = new RestTemplate();// whenever we consume the services from url first create an object of restTemplate
		Reservation reservation = restTemplate.getForObject("http://localhost:8080/flights/reservation/"+id, Reservation.class);
		return reservation;
	}

	@Override
	public Reservation updateReservation(ReservationUpdateRequest request) {
		RestTemplate restTemplate = new RestTemplate();
		Reservation reservation = restTemplate.postForObject("http://localhost:8080/flights/reservation/", request, Reservation.class);
		return reservation;
	}

}
