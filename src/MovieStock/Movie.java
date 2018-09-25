package MovieStock;

import java.time.Period;

public abstract class Movie {

    private final String TITLE;
    private final int PRICE;
    private final int UNIQUE_ID;
    private int ageRating;
    private boolean hasLicense;
    private Period rentPeriod;

    public String getTitle() {
        return TITLE;
    }
    
    public int getPrice() {
        return PRICE;
    }
    
    public int getID() {
        return UNIQUE_ID;
    }
    
    public int getAgeRating(){
      return ageRating;
    }
   
    public void setAgeRating(int ageRating) {
        this.ageRating = ageRating;
    }
   
    public boolean getHasLicense() {
        return hasLicense;
    } 
   
    public void setHasLicense(boolean hasLicense) {
        this.hasLicense = hasLicense;
    }
    
    public void setRentPeriod(Period rentPeriod) {
        this.rentPeriod = rentPeriod;
    }
    
    public Period getRentPeriod() {
        return rentPeriod;
    }
    
    public Movie(String title, int price, int uniqueID, int ageRating, boolean hasLicence) {
        this.TITLE = title;
        this.PRICE = price;
        this.UNIQUE_ID = uniqueID;
        this.ageRating = ageRating;
        this.hasLicense = hasLicence;
        this.rentPeriod = Period.ofWeeks(2);
    }
}
