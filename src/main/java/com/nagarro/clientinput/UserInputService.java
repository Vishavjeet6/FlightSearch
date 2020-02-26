package com.nagarro.clientinput;
/*
* Class name - UserInputService
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
* Description - Takes the required input and validate it
*/
import java.util.ArrayList;
import java.util.Scanner;

import com.nagarro.files.FlightFiles;

public class UserInputService {
	Scanner sc = new Scanner(System.in);
	String departure_location;
	String arrival_location;
	String flight_date;
	String flight_class;
	int list_sort=0;
	
	public UserInput takeInput(ArrayList<FlightFiles> filesData) {
		ValidationService validation = new ValidationService(filesData);
		
		System.out.println("Departure Location enter 3 letter code");
		departure_location = sc.next().toUpperCase();
		while(!validation.validate_departure(departure_location)) {
			departure_location = sc.next().toUpperCase();
		}
		
		System.out.println("Arrival Location enter 3 letter code");
		arrival_location = sc.next().toUpperCase();
		while(!validation.validate_arrival(arrival_location)) {
			arrival_location = sc.next().toUpperCase();
		}
		
		System.out.println("Flight Date in dd-mm-yyyy format");
		flight_date = sc.next();
		while(!validation.validate_date(flight_date)) {
			flight_date = sc.next();
		}
		
		System.out.println("Enter Flight Class E or B");
		flight_class = sc.next().toUpperCase();
		while(!validation.validate_class(flight_class)) {
			flight_class = sc.next().toUpperCase();
		}
		
		System.out.println("Enter 1 to sort by fare and 2 for fare and duration");
		String preference = sc.next();
		while(!validation.validate_preference(preference)) {
			preference = sc.next();
		}
		list_sort = Integer.parseInt(preference);

		UserInput userInput = new UserInput(departure_location, arrival_location, flight_date, flight_class, list_sort);
		return userInput;
		}
	}
