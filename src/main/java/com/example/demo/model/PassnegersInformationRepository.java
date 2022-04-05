package com.example.demo.model;

import org.springframework.data.repository.CrudRepository;

public interface PassnegersInformationRepository extends CrudRepository<PassengersInformation, Long> {

	PassengersInformation findByName(String nameOfTheCustomer);

}
