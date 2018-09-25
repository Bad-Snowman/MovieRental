package MovieStock;

public abstract class Movie {

    private final String TITLE;
    private final int PRICE;
    private final int UNIQUE_ID;
    private int ageRating;
    private boolean hasLicense;

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
   
    public void hasLicense(boolean hasLicense) {
        this.hasLicense = hasLicense;
    } 
    
    public Movie(String title, int price, int uniqueID, int ageRating, boolean hasLicence) {
        this.TITLE = title;
        this.PRICE = price;
        this.UNIQUE_ID = uniqueID;
        this.ageRating = ageRating;
        this.hasLicense = hasLicence;
    }
}
