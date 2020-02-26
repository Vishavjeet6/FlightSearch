package com.nagarro.files;
/*
* Class name - ReadFilesService
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
* Description - Read csv files and store data in list
*/
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFilesService implements Runnable{
	String filePath;
	ArrayList<FlightFiles> filesData;
	ReadFilesService(String filePath, ArrayList<FlightFiles> filesData){
		this.filePath = filePath;
		this.filesData = filesData;
	}
	
	public void run() {
		readFile(filePath, filesData);
	}
	
	private void readFile(String filePath, ArrayList<FlightFiles> filesData) {
		String flightNo = "";
		String depLoc = "";
		String arrLoc = "";
		String validTill = "";
		String flightTime = "";
		float flightDur;
		float fare;
		String seatAvailable = "";
		String seatClass = "";
		Scanner read = null;
		try {
			read = new Scanner(new File(filePath));
			read.useDelimiter("[|\n]");
			read.nextLine();
			while(read.hasNext()) {
				flightNo = read.next();
				depLoc = read.next();
				arrLoc = read.next();
				validTill = read.next();
				flightTime = read.next();
				flightDur = Float.parseFloat(read.next());
				fare = Float.parseFloat(read.next());
				seatAvailable = read.next();
				seatClass = read.next();
               
				FlightFiles filedata = new FlightFiles(flightNo, depLoc, arrLoc, validTill, flightTime, 
						flightDur, fare, seatAvailable, seatClass);
                filesData.add(filedata);         
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			read.close();
		}
	}
}
