package com.nagarro.flightOutput;
/*
* Class name - DisplayFlights
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
* Description - It displays the available flight
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import com.nagarro.files.FlightFiles;

public class DisplayFlights {

	public void sortList(ArrayList<FlightFiles> outputList, int listSort) {		
		if(listSort == 1) {
			Collections.sort(outputList, new Comparator<FlightFiles>(){
				public int compare(FlightFiles o1, FlightFiles o2) {
					if(o1 == null) {
						return (o2==null) ? 0: -1;
					}
					if(o2 == null) {
						return 1;
					}
					return (int)(o1.getFare()-o2.getFare());
				}
			});
		} else {
			Collections.sort(outputList, new Comparator<FlightFiles>(){
				public int compare(FlightFiles o1, FlightFiles o2) {
					if(o1 == null) {
						return (o2==null) ? 0: -1;
					}
					if(o2 == null) {
						return 1;
					}
					Float x1 = o1.getFare();
					Float x2 = o2.getFare();
					int scomp =  x1.compareTo(x2);
					if(scomp!=0) {
						return scomp;
					}
					Float d1 = o1.getFlight_dur();
					Float d2 = o2.getFlight_dur();
					return d1.compareTo(d2);
				}
			});
		}	
	}

	public void displayList(ArrayList<FlightFiles> outputList, int listSort) {
		if(!outputList.isEmpty()) {
			sortList(outputList, listSort);
			System.out.print("FlightNo ");
			System.out.print("|   Departure");
			System.out.print("\t |     Arrival");
			System.out.print("\t |  Time  ");
			System.out.print("   |\t Fare");
			System.out.println("\t| Duration |");	
			for(FlightFiles data:outputList)
	        {
				if(data == null) continue;
	            System.out.print(" "+data.getFlight_no());
	            System.out.print("\t |\t"+data.getDep_loc());
	            System.out.print("\t |\t"+data.getArr_loc());
	            System.out.print("\t |"+data.getValid_till());
	            System.out.print(" | "+data.getFare());
	            System.out.println("\t|  "+data.getFlight_dur()+"\t   |");
	        }
		}
		else {
			System.out.println("No flights found");
		}	
	}
}
