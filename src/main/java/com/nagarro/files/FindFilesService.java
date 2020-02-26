package com.nagarro.files;
/*
* Class name - FindFilesService
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
* Description - It find the csv files in a folder
*/
import java.io.File;
import java.util.LinkedList;
import java.util.List;

public class FindFilesService {
	
	static final File folder = new File("C:\\Users\\vishavjeetsingh\\eclipse-workspace\\FlightSearch1\\src\\main\\resources");
	
	public List<String> findFiles() {	
		List<String> filenames = new LinkedList<String>();
		for(final File fileEntry : folder.listFiles() ) {
			if(fileEntry.getName().contains(".csv")) {
				filenames.add(fileEntry.getName());
			}
		}
		return filenames;
	}
}
