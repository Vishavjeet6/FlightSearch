package com.nagarro.files;
/*
* Class name - ReadFiles
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
* Description - It reads each csv file using threads
*/
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ReadFiles {
	
	static final File folder = new File("C:\\Users\\vishavjeetsingh\\eclipse-workspace\\FlightSearch1\\src\\main\\resources");

	public ArrayList<FlightFiles> readFiles(List<String> filenames) throws InterruptedException {	
		Thread[] threads = new Thread[filenames.size()];
		ArrayList<FlightFiles> filesData = new ArrayList<FlightFiles>();
		int i =0;
		for(String file: filenames) {	
			threads[i] = new Thread(new ReadFilesService(folder+"\\"+file, filesData));
			threads[i].start();
			i++;
		}
		for(Thread thread: threads) {
			thread.join();
		}	
		return filesData;		
	}		
}

