package com.Flight_Checkin.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Flight_Checkin.Integration.ReservationRestfulClient;
import com.Flight_Checkin.Integration.Dto.Reservation;
import com.Flight_Checkin.Integration.Dto.ReservationUpdateRequest;

@Controller
public class ReservationController {
	@Autowired
	private ReservationRestfulClient restClient;
	

	@RequestMapping("/startCheckIn")
	public String startCheckIn() {
		return "startCheckin";
	}

	@RequestMapping("/proceedChekIn")
	public String proceedCheckIn(@RequestParam("id") Long id, ModelMap modelMap) {
		Reservation reservation = restClient.findReservation(id);
		modelMap.addAttribute("reservation",reservation);
		return "displayReservation";
	}
	
	@RequestMapping("/proceedToChekIn")
	public String proceedToCheckIn(@RequestParam("id") Long id,@RequestParam("numberOfBags") int numberOfBags) {
		ReservationUpdateRequest request = new ReservationUpdateRequest();
		request.setId(id);
		request.setNumberOfBags(numberOfBags);
		request.setCheckedInStatus(true);
		restClient.updateReservation(request);
		return "confirmReservation";
	}

	
}
