package controllers;

import models.MeterMaid;
import models.ParkingLocation;
import play.data.DynamicForm;
import play.data.Form;
import play.db.ebean.Model;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {
	
	private static String byline = "Why feed the meter?";
	private static Form<MeterMaid> maidForm = Form.form(MeterMaid.class);
	private static Form<ParkingLocation> parkingForm = Form.form(ParkingLocation.class);
	
    public static Result index() {
    	// render the splash page with blank forms
        return ok(index.render(byline, maidForm, parkingForm));
    }
    
    public static Result reportMetermaidSighting(){
    	
//    	DynamicForm requestData = Form.form().bindFromRequest();
//		String maidLocation = requestData.get("maidLocation");
//		String heading = requestData.get("heading");
//		
//		play.Logger.debug(maidLocation + heading);
    	
    	/**
    	 * Handle form
    	 */
    	// map form to instance
    	
    	// handle new information
    	
    	// render the splash page again    	
    	return ok(index.render(byline, maidForm, parkingForm));
    	
    }
    
    public static Result submitParkingWatch(){
    			
//    	DynamicForm requestData = Form.form().bindFromRequest();
//        String phoneNumber = requestData.get("phoneNumber");
//        String vehicleLocation = requestData.get("vehicleLocation");
//        String startTime = requestData.get("startTime");
//        
//        play.Logger.debug(phoneNumber + vehicleLocation + startTime);
        
    	/**
    	 * Handle form
    	 */
    	// map form to instance
    	
    	// handle new information
    	
    	
    	// render the splash page again
    	return ok(index.render(byline, maidForm, parkingForm));
    	
    }
  
}
