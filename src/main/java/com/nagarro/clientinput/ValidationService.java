package com.nagarro.clientinput;
/*
* Class name - ValidationService
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
* Description - Validates the input
*/
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import com.nagarro.files.FlightFiles;

public class ValidationService {
	Set<String> arrivalLoc = new HashSet<String>();
	Set<String> departureLoc = new HashSet<String>();
	
	public ValidationService(ArrayList<FlightFiles> filesData) {
		for(FlightFiles files: filesData) {
			if(files == null) continue;
			arrivalLoc.add(files.getArr_loc());
			departureLoc.add(files.getDep_loc());
		}
	}

	public boolean validate_arrival(String arrival_loc) {
		if(arrival_loc.length() != 3) {
			System.out.println("Please Enter 3 letter only");
			return false;
		}
		for (String s : arrivalLoc) {
		    if(s.equals(arrival_loc)) {
		    	return true;
		    }
		}
		System.out.println("Enter Location from below\n");
		for(String location : arrivalLoc) {
			System.out.println(location);
		}
		return false;
	}
	
	public boolean validate_departure(String departure_loc) {
		if(departure_loc.length() != 3) {
			System.out.println("Please Enter 3 letter only");
			return false;
		}
		for (String s : departureLoc) {
		    if(s.equals(departure_loc)) {
		    	return true;
		    }
		}
		System.out.println("Enter Location from below\n");
		for(String location : departureLoc) {
			System.out.println(location);
		}
		return false;
	}
	
	public boolean validate_date(String date) {
		DateFormat sdformat;
		sdformat  = new SimpleDateFormat("dd-mm-yyyy");
		try {
			sdformat.parse(date);
		} catch (ParseException e1) {
			System.out.println("Please Enter Date in Correct Format");
			return false;
		}
		return true;
	}
	
	public boolean validate_class(String flight_class) {
		if(flight_class.contains(FlightClass.E.toString()) || flight_class.contains(FlightClass.B.toString())){
			return true;
		}else {
			System.out.println("Wrong Class! \n Enter E or B");
			return false;
		}
		
	}
	
	public boolean validate_preference(String list_sort) {
		if(list_sort.equals("1") || list_sort.equals("2")) {
			return true;
		}
		else {
			System.out.println("Please Enter 1 or 2");
			return false;
		}
	}
}
