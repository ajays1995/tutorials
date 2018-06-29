package dockerexample.cab;

public class CabDetails {

	private String bookingNumber;
	private String driverName;
	private String driveMobileNumber;
	private String cabNumber;
	private String carModel;
	private int estimatedTime;
	private double driverLatitude;
	private double driverLongitude;
	public String getDriverName() {
		return driverName;
	}
	
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	
	public String getDriveMobileNumber() {
		return driveMobileNumber;
	}
	
	public void setDriveMobileNumber(String driveMobileNumber) {
		this.driveMobileNumber = driveMobileNumber;
	}
	
	public String getCabNumber() {
		return cabNumber;
	}
	
	public void setCabNumber(String cabNumber) {
		this.cabNumber = cabNumber;
	}
	
	public String getCarModel() {
		return carModel;
	}
	
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	
	public int getEstimatedTime() {
		return estimatedTime;
	}
	
	public void setEstimatedTime(int estimatedTime) {
		this.estimatedTime = estimatedTime;
	}
	
	public double getDriverLatitude() {
		return driverLatitude;
	}
	
	public void setDriverLatitude(double driverLatitude) {
		this.driverLatitude = driverLatitude;
	}
	
	public double getDriverLongitude() {
		return driverLongitude;
	}
	
	public void setDriverLongitude(double driverLongitude) {
		this.driverLongitude = driverLongitude;
	}
	
	
	
}
