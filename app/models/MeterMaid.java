package models;

import javax.persistence.Entity;

import play.db.ebean.Model;

@Entity
public class MeterMaid extends Model {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String location;
	public String heading;
	public String velocity;
	
}
