package com.nagarro.flightclient;
/*
* Class name - FlightFacade
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
* Description - Facade Class 
*/
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import com.nagarro.files.*;
import com.nagarro.flightOutput.*;
import com.nagarro.clientinput.*;

public class FlightFacade {
	private FindFilesService files;
	private ReadFiles read;
	private UserInputService input;
	private UserInput userInput;
	private ArrayList<FlightFiles> filesData;
	private ArrayList<FlightFiles> outputList;
	private FindFlightsService find;
	private DisplayFlights view;
	
	FlightFacade(){
		this.files = new FindFilesService();
		this.read = new ReadFiles();
		this.input = new UserInputService();
		this.view = new DisplayFlights();
		this.find = new FindFlightsService();
	}

	public void getData() {	
		List<String> filenames = new LinkedList<String>();
		filenames = files.findFiles();
		try {
			filesData = read.readFiles(filenames);
		} catch (InterruptedException e) {
			System.out.println("Error in reading files");
			System.exit(0);
		}	
	}
	
	public void getInput() {
		userInput = input.takeInput(filesData);		
	}

	public void findFlights() {
		outputList = find.getFlights(userInput, filesData);	
	}

	public void displayFlights() {
		view.displayList(outputList, userInput.getListSort());
	}
}