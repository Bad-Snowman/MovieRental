package MovieStock;

/**
 * The Stock class handles the stock of Movie objects for the store.
 */
public class Stock {
    
    private final int CAPACITY;                         //The capacity of the store.
    private Movie[] stock;                              //The movies stocked in the store.
    
    //Returns the store's entire stock of Movies.
    public Movie[] getStock() {
        return stock;
    }
    
    //Returns a movie from ID number.
    public Movie getMovie(int uniqueID) {
        
        for(int i = 0; i < CAPACITY; i++) {             //Looping through all members.
            if(stock[i].getID() == uniqueID) {          //Checking if the ID matches the i'th member's ID.
                return stock[i];                        //The member is found.
            }
        }
        return null;                                    //If this line is reached, then the member is not found.
        
    }
    
    //Checks if the Movie is in stock.
    public boolean isStocked(Movie movie) {
        
        for(int i = 0; i < CAPACITY; i++) {             //Looping through the entire stock.
            if(stock[i] != null) {                      //Checking if the "space on the shelf" is reserved for a movie.
                if(movie.getID() == stock[i].getID()) { //Checking if the found space is for that specific movie.
                    return true;                        //The movie is found.
                }
            }
        }
        return false;                                   //If this line is reached, then the movie is not found.
        
    }
    
    //Checks if the store has space for more movies.
    private boolean hasSpace() {
        
        for(int i = 0; i < CAPACITY; i++) {             //Looping through the entire stock.
            if(stock[i] == null) {                      //Checking if the "space on the shelf" is empty.
                return true;                            //An empty space is found.
            }
        }
        return false;                                   //If this line is reached, the stock is full.
        
    }
    
    //Adds a new movie to the stock.
    public void addToStock(Movie movie) {
        
        for(int i = 0; i < CAPACITY; i++) {             //Looping through the entire stock.
            if(stock[i] == null) {                      //Checking if the "space on the shelf" is empty.
                stock[i] = movie;                       //Placing the movie at the i'th index.
                return;
            }
        }
        
    }
    
    //Removes a movie from the stock.
    public void removeFromStock(Movie movie) {
        
        for(int i = 0; i < CAPACITY; i++) {             //Looping through the entire stock.
            if(stock[i] != null) {                      //Checking if the "space on the shelf" is reserved for a movie.
                if(movie.getID() == stock[i].getID()) { //Checking if the found space is for that specific movie.
                    stock[i] = null;                    //Removing the movie from the stock.
                    return;
                }
            }
        }
        
    }

    //Constructor
    public Stock() {
        this.CAPACITY = 30;                             //The store's capacity is set.
        this.stock = new Movie[CAPACITY];               //The stock's size is set to the capacity.
    }
    
}
