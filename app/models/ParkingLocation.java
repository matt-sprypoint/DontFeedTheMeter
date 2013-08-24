package models;

import java.util.Date;

import play.db.ebean.Model;

public class ParkingLocation extends Model {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String contactNumber;
	public String location;
	public Date startTime;
	
}
