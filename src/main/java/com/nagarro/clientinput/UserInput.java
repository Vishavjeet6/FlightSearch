package com.nagarro.clientinput;

/*
* Class name - UserInput
*
* Version info - 0.3
*
* Copyright notice - @2020 Nagarro Private Limited.
* 
* Author info - Vishavjeet Singh
*
* Creation date - 10-01-2020
*
* Last updated By - Vishavjeet Singh
*
* Last updated Date - 14-01-2020
*
* Description - User Input Model
*/

public class UserInput {
	private String departureLocation;
	private String arrivalLocation;
	private String date;
	private String flightClass;
	private int listSort;
	
	public UserInput(String departureLocation, String arrivalLocation, String date, String flightClass, int listSort) {
		this.departureLocation = departureLocation;
		this.arrivalLocation = arrivalLocation;
		this.date = date;
		this.flightClass = flightClass;
		this.listSort = listSort;
	}
	
	public String getDepartureLocation() {
		return departureLocation;
	}

	public void setDepartureLocation(String departureLocation) {
		this.departureLocation = departureLocation;
	}

	public String getArrivalLocation() {
		return arrivalLocation;
	}

	public void setArrivalLocation(String arrivalLocation) {
		this.arrivalLocation = arrivalLocation;
	}

	public String getFlightClass() {
		return flightClass;
	}

	public void setFlightClass(String flightClass) {
		this.flightClass = flightClass;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getListSort() {
		return listSort;
	}
	
	public void setListSort(int listSort) {
		this.listSort = listSort;
	}
}
