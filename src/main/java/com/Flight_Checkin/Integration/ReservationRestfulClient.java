package com.Flight_Checkin.Integration;

import org.springframework.web.bind.annotation.RequestBody;

import com.Flight_Checkin.Integration.Dto.Reservation;
import com.Flight_Checkin.Integration.Dto.ReservationUpdateRequest;

public interface ReservationRestfulClient {
         public Reservation findReservation(Long id);
      public Reservation updateReservation(@RequestBody ReservationUpdateRequest request);
}
