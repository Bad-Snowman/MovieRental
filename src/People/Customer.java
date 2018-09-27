package People;

import MovieStock.Movie;
import java.time.LocalDate;

public class Customer extends Person {

    private final int MEMBERSHIP_ID;
    private Movie[] rentedMovies;
    private int numMoviesAllowed = 10;
    
    public int getMembershipID() {
        return MEMBERSHIP_ID;
    }
    
    public void rentMovie(Movie movie) {
        //TODO
                
        //if 
        //  Movie is in stock
        //  Store has movie license
        //  Customer is old enough
        //  numMoviesAllowed is not exeeded (There is an empty space in the array)
        //then
        //  Add movie to to rentedMovies
        //  Set the movie's attribute to be rented out
        
    }
    
    public void returnMovie(Movie movie) {
        //TODO
    }
    
    public Customer(String firstName, String lastName, String address, LocalDate dateOfBirth, int membership_ID) {
        super(firstName, lastName, address, dateOfBirth);
        this.MEMBERSHIP_ID = membership_ID;
        this.rentedMovies = new Movie[numMoviesAllowed];
    }

}
