package videorental;

public class MovieRentalSystem {

    public static void main(String[] args) {
        
        //Instantiate a library generator
        LibraryGenerator lib = new LibraryGenerator();
        
        //Generate managers, employees and customers
        lib.generatePeople();
        
        //Generate movies of all kinds
        lib.generateMovies();
        
        //TODO
        //The rest of the functionality :-P
        
    }
    
}
