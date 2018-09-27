package MovieStock;

import java.time.LocalDate;
import java.time.Period;

/**
 * The Movie class is an abstract superclass for the specific media classes; BluRay, DVD and VHS.
 * Handles information about the movies, and whether or not they are currently being rented out.
 */
public abstract class Movie {

    private final String TITLE;     //The title of the movie.
    private final int PRICE;        //The amount the movie costs to rent.
    private final int UNIQUE_ID;    //A unique identifier.
    private int ageRating;          //The age rating of the movie.
    private boolean isRented;       //Whether or not the movie is rented out.
    private boolean hasLicense;     //Whether or not the store has the license to rent out the movie.
    private LocalDate dueDate;     //The date the movie is rented out.
    private Period rentPeriod;      //The period a customer can keep the movie when rented.

    public String getTitle() { return TITLE; }
    
    public int getPrice() { return PRICE; }
    
    public int getID() { return UNIQUE_ID; }
    
    public int getAgeRating(){ return ageRating; }
    public void setAgeRating(int ageRating) { this.ageRating = ageRating; }
    
    public boolean getIsRented() { return isRented; }
    public void rentMovie() { this.isRented = true; }
    public void returnMovie() { this.isRented = false; }
    
    public boolean getHasLicense() { return hasLicense; }
    public void setHasLicense(boolean hasLicense) { this.hasLicense = hasLicense; }
    
    public LocalDate getDueDate() { return dueDate; }
    public void setDueDate(LocalDate dueDate) { this.dueDate = dueDate; }
    
    public Period getRentPeriod() { return rentPeriod; }
    public void setRentPeriod(Period rentPeriod) { this.rentPeriod = rentPeriod; }
    
    /**
     * Constructor
     * @param title The title of the movie.
     * @param price The amount the movie costs to rent.
     * @param uniqueID A unique identifier.
     * @param ageRating The age rating of the movie.
     * @param hasLicence Whether or not the store has the license to rent out the movie.
     */
    public Movie(String title, int price, int uniqueID, int ageRating, boolean hasLicence) {
        this.TITLE = title;
        this.PRICE = price;
        this.UNIQUE_ID = uniqueID;
        this.ageRating = ageRating;
        this.hasLicense = hasLicence;
        this.rentPeriod = Period.ofWeeks(2); //The rent period is set to 2 weeks.
        this.isRented = false;
    }
}
