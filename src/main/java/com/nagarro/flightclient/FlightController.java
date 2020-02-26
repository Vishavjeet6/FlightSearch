package com.nagarro.flightclient;

/*
* Class name - FlightController
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
* Description - Main Client Class
*/

public class FlightController {
	
	public static void main(String[] args) {
		FlightFacade facade = new FlightFacade();
		facade.getData();
		facade.getInput();
		facade.findFlights();
		facade.displayFlights();
	}
}
