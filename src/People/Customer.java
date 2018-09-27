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
    
    public Movie[] getRentedMovies() {
        return rentedMovies;
    }
    
    public void rentMovie(Movie movie) {
        //if 
        //  Movie is not rented out
        //  Store has movie license
        //  Customer is old enough
        //  numMoviesAllowed is not exeeded (There is an empty space in the array)
        //then
        //  Add movie to to rentedMovies
        //  Set the movie's attribute to be rented out
        
        if(!movie.getIsRented() && movie.getHasLicense()) {
            if(getAge() >= movie.getAgeRating() && hasSpace()) {
                for(int i = 0; i < numMoviesAllowed; i++) {     //Looping through the customers rented movies.
                    if(rentedMovies[i] == null) {               //Checking if there is an empty space.
                        rentedMovies[i] = movie;                //The movie is placed in empty space in rentedMovies.
                        movie.rentMovie();
                        movie.setDueDate(LocalDate.now().plus(movie.getRentPeriod()));
                        return;
                    }
                }
            }
        }
        
    }
    
    public void returnMovie(Movie movie) {
        
        for(int i = 0; i < numMoviesAllowed; i++) {             //Looping through the customers rented movies.
            if(rentedMovies[i].getID() == movie.getID()) {      //Checking if there is an empty space.
                rentedMovies[i] = null;                         //The movie is placed in empty space in rentedMovies.
                movie.returnMovie();
                return;
            }
        }
    }
    
    //Checks if the customer can rent any more movies.
    private boolean hasSpace() {
        
        for(int i = 0; i < numMoviesAllowed; i++) {     //Looping through the customers rented movies.
            if(rentedMovies[i] == null) {               //Checking if there is an empty space.
                return true;                            //An empty space is found.
            }
        }
        return false;                                   //If this line is reached, the customer has rented max amount.
        
    }
    
    public Customer(String firstName, String lastName, String address, LocalDate dateOfBirth, int membership_ID) {
        super(firstName, lastName, address, dateOfBirth);
        this.MEMBERSHIP_ID = membership_ID;
        this.rentedMovies = new Movie[numMoviesAllowed];
    }

}
