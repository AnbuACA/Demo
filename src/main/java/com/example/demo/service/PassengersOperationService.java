package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.PassengersInformation;
import com.example.demo.model.PassnegersInformationRepository;

@Service
public class PassengersOperationService {

	@Autowired
	PassnegersInformationRepository repository;

	public PassengersInformation savePassengersData(PassengersInformation passInformation) {
		PassengersInformation res = repository.save(passInformation);
		return res;
	}

	public List<PassengersInformation> getAllPassengersData() {
		List<PassengersInformation> list = new ArrayList<PassengersInformation>();
		repository.findAll().forEach(list::add);
		return list;
	}

	public PassengersInformation getSinglePassnegersData(String nameOfTheCustomer) {
		PassengersInformation res = repository.findByName(nameOfTheCustomer);
		return Objects.nonNull(res) ? res : new PassengersInformation();
	}

	public PassengersInformation getSinglePassnegersDataByTicketId(Long ticketId) {
		PassengersInformation res = repository.findById(ticketId).map(x->x).orElse(new PassengersInformation());
		return res;
	}

}
