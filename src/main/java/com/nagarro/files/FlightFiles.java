package com.nagarro.files;
/*
* Class name - FlightFiles
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
* Description - Model of the files record
*/
public class FlightFiles {
	
	private String flight_no;
	private String dep_loc;
	private String arr_loc;
	private String valid_till;
	private String flight_time;
	private float flight_dur;
	private float fare;
	private String seat_availability;
	private String flight_class;
	
	public FlightFiles(String flight_no, String dep_loc, String arr_loc, String valid_till,String flight_time, 
			float flight_dur, float fare, String seat_availability, String flight_class) {
		this.setFlight_no(flight_no);
		this.setDep_loc(dep_loc);
		this.setArr_loc(arr_loc);
		this.setValid_till(valid_till);
		this.setFlight_time(flight_time);
		this.setFlight_dur(flight_dur);
		this.setFare(fare);
		this.setSeat_availability(seat_availability);
		this.setFlight_class(flight_class);
	}

	public String getFlight_no() {
		return flight_no;
	}

	public void setFlight_no(String flight_no) {
		this.flight_no = flight_no;
	}

	public String getDep_loc() {
		return dep_loc;
	}

	public void setDep_loc(String dep_loc) {
		this.dep_loc = dep_loc;
	}

	public String getArr_loc() {
		return arr_loc;
	}

	public void setArr_loc(String arr_loc) {
		this.arr_loc = arr_loc;
	}

	public String getValid_till() {
		return valid_till;
	}

	public void setValid_till(String valid_till) {
		this.valid_till = valid_till;
	}

	public float getFlight_dur() {
		return flight_dur;
	}

	public void setFlight_dur(float flight_dur) {
		this.flight_dur = flight_dur;
	}

	public float getFare() {
		return fare;
	}

	public void setFare(float fare) {
		this.fare = fare;
	}

	public String getSeat_availability() {
		return seat_availability;
	}

	public void setSeat_availability(String seat_availability) {
		this.seat_availability = seat_availability;
	}

	public String getFlight_class() {
		return flight_class;
	}

	public void setFlight_class(String flight_class) {
		this.flight_class = flight_class;
	}

	public String getFlight_time() {
		return flight_time;
	}

	public void setFlight_time(String flight_time) {
		this.flight_time = flight_time;
	}
}
