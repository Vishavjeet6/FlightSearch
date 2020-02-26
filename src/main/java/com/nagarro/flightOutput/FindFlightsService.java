package com.nagarro.flightOutput;
/*
* Class name - FindFlightsService
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
* Description - It find the flights which match the user criteria
*/
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import com.nagarro.clientinput.UserInput;
import com.nagarro.files.FlightFiles;

public class FindFlightsService {

	public ArrayList<FlightFiles> getFlights(UserInput userInput, ArrayList<FlightFiles> filesData) {	
		ArrayList<FlightFiles> outputList = new ArrayList<FlightFiles>();
		for(FlightFiles data : filesData) {
			if(data == null) continue;
			if(userInput.getArrivalLocation().equals(data.getArr_loc()) && 
					userInput.getDepartureLocation().equals(data.getDep_loc()) && 
					data.getFlight_class().contains(userInput.getFlightClass()) && 
					data.getSeat_availability().equals("Y")) {		
				DateFormat sdformat;
				sdformat  = new SimpleDateFormat("dd-mm-yyyy");
				Date d1;
				Date d2;
				try {
					d1 = sdformat.parse(data.getValid_till());
					d2 = sdformat.parse(userInput.getDate());
				} catch (ParseException e) {
					continue;
				}  
                if(d2.compareTo(d1) <= 0) {
					if(userInput.getFlightClass().equals("B")) {
						data.setFare((float) (data.getFare()*1.4));
					}
					outputList.add(data);
                }
			}
		}
		return outputList;	
	}
}
