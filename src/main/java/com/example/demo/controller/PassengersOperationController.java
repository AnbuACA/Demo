package com.example.demo.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.PassengersInformation;
import com.example.demo.service.PassengersOperationService;

@RestController
@RequestMapping("/api/passenger")
public class PassengersOperationController {

	@Autowired
	private PassengersOperationService service;

	// storing the passnegers deatils(add passengers details)
	@PostMapping(value = "/savePassnegersData", consumes = "application/json")
	public ResponseEntity<?> savePassnegersData(@RequestBody() PassengersInformation passInformation) {
		PassengersInformation res = service.savePassengersData(passInformation);
		return ResponseEntity.ok(res);
	}

	// getting all details of the passengers
	@GetMapping(value = "/getAll/passnegersData")
	public List<PassengersInformation> getAllPassnegersData() {
		List<PassengersInformation> res = service.getAllPassengersData();
		return !res.isEmpty() ? res : Collections.EMPTY_LIST;
	}

	// getting particular person details (Search by name)
	@GetMapping(value = "/get/passnegerData/{nameOfTheCustomer}")
	public PassengersInformation getSinglePassnegersData(@PathVariable String nameOfTheCustomer) {
		return service.getSinglePassnegersData(nameOfTheCustomer);
	}
	
	// getting details by ticketId
	@GetMapping(value = "/get/passnegerData/ticketNumber/{ticketId}")
	public PassengersInformation getSinglePassnegersData(@PathVariable Long ticketId) {
		return service.getSinglePassnegersDataByTicketId(ticketId);
	}

}
