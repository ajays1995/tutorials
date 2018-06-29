package dockerexample.cab;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

//@Controller
public class RideAvailability {

	
	/**
	 * Get the List of Cabs
	 * @param pickupLatitude
	 * @param pickupLongitude
	 * @param category
	 * @return
	 *//*
	@RequestMapping(name="/cab",method=RequestMethod.GET,produces="application/json")
	public @ResponseBody List<Categories> getRides(double pickupLatitude, 
			double pickupLongitude, String category){
		
		return null;
	}
	
	*//**
	 * Book A cab
	 * @param pickupLatitue
	 * @param pickupLongitude
	 * @param dropLatitude
	 * @param dropLongitude
	 * @param rideNow
	 * @param category
	 * @return
	 *//*
	@RequestMapping(name="/cab", method=RequestMethod.POST, produces="application/json")
	public @ResponseBody CabDetails bookRide(double pickupLatitue,
			double pickupLongitude,
			double dropLatitude,
			double dropLongitude,
			boolean rideNow,
			String category){
		
		return null;
		
	}
	
	*//**
	 * Cancel Cab
	 * @param bookingReferenceNumber
	 * @param reason
	 * @return
	 *//*
	@RequestMapping(name="/cab", method=RequestMethod.DELETE, produces="application/json")
	public @ResponseBody String cancelRide(String bookingReferenceNumber,
			String reason){
		
		String msg = "success";//success/failure
		return msg;	
		
	}
	
	*//**
	 * Get Estimate for Ride
	 * @param category
	 * @param pickupLatitude
	 * @param pickupLongitude
	 * @param dropLatitude
	 * @param dropLongitude
	 * @param rideTime
	 * @return
	 *//*
	@RequestMapping(name="/estimate", method=RequestMethod.GET, produces="application/json")
	public @ResponseBody double cancelRide(String category,
			double pickupLatitude, double pickupLongitude,
			double dropLatitude, double dropLongitude,
			double rideTime){
		
		double cost = 0;
		return cost;
		
	}*/
}
