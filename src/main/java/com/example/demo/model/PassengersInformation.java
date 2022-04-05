package com.example.demo.model;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class PassengersInformation {

	@Id
	@GenericGenerator(name = "passenger_info_id_generator", strategy = "com.example.demo.common.CustomIdGenerator")
	@GeneratedValue(generator = "passenger_info_id_generator")
	@Column(updatable = false, nullable = false)
	private Long ticketId;

	private String name;

	private int age;

	private String sex;

	private String countryOfResident;

	private String flightNumber;

	private String departureAirport;

	private String arrivalAirport;

	public Long getTicketId() {
		return ticketId;
	}

	public void setTicketId(Long ticketId) {
		this.ticketId = ticketId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getCountryOfResident() {
		return countryOfResident;
	}

	public void setCountryOfResident(String countryOfResident) {
		this.countryOfResident = countryOfResident;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getDepartureAirport() {
		return departureAirport;
	}

	public void setDepartureAirport(String departureAirport) {
		this.departureAirport = departureAirport;
	}

	public String getArrivalAirport() {
		return arrivalAirport;
	}

	public void setArrivalAirport(String arrivalAirport) {
		this.arrivalAirport = arrivalAirport;
	}

}
