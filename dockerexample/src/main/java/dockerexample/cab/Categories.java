package dockerexample.cab;

public class Categories {
	
	private String categoryName;
	
	private String currency;
	private String distanceUnit;
	private boolean flagLater = false;
	private BreakUp breakUp;
	public String getCategoryName() {
		return categoryName;
	}
	
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	public String getCurrency() {
		return currency;
	}
	
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	public String getDistanceUnit() {
		return distanceUnit;
	}
	
	public void setDistanceUnit(String distanceUnit) {
		this.distanceUnit = distanceUnit;
	}
	
	public boolean isFlagLater() {
		return flagLater;
	}
	
	public void setFlagLater(boolean flagLater) {
		this.flagLater = flagLater;
	}
	
	public BreakUp getBreakUp() {
		return breakUp;
	}
	
	public void setBreakUp(BreakUp breakUp) {
		this.breakUp = breakUp;
	}
	
	

}
