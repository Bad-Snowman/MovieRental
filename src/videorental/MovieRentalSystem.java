package videorental;

import MovieStock.*;
import People.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MovieRentalSystem {

    MembershipDatabase mdb;
    Stock stock;
    
    Employee employee;
    Manager manager;
    
    public static void main(String[] args) {
        
        MovieRentalSystem mrs = new MovieRentalSystem();
        mrs.setup();
        
        mrs.runStore();        
        
    }
    
    
    private void runStore() {
        //1. A customer wishes to rent two movies
        mdb.getMember(2).rentMovie(stock.getMovie(4));
        mdb.getMember(2).rentMovie(stock.getMovie(2));
        
        System.out.println(writeReceipt(mdb.getMember(2)));
        
        
    }
    
    /**
     * A method for setting up the "preexisting" conditions for a functional store.
     */
    private void setup() {
                
        //Generate managers, employees and customers
        generatePeople();
        
        //Generate movies of all kinds
        generateMovies();
        
    }
    
    public void generatePeople() {
        
        mdb = new MembershipDatabase();
        
        //First name, Last name, Address, DOB, ID-number
        employee = new Employee("John", "Doe", "Hogwarts", LocalDate.parse("1928-04-01"), 7);
        manager = new Manager("Jane", "Doe", "Isengard", LocalDate.parse("1728-04-01"), 1);
        
        Customer[] customers = new Customer[10];
        //First name, Last name, Address, DOB, ID-number
        customers[0] = new Customer("Rasmus", "Sørensen", "Et rart sted", LocalDate.parse("2007-09-26"), 0);
        customers[1] = new Customer("Mathias", "Hellesøe", "Et dejligt sted", LocalDate.parse("1971-09-26"), 1);
        customers[2] = new Customer("Thomas", "Dahl", "Skuldelev Strand", LocalDate.parse("1991-08-17"), 2);
        customers[3] = new Customer("Gargamel", "Ond", "Smølfeland", LocalDate.parse("2010-01-01"), 3);
        customers[4] = new Customer("Lars", "Larsen", "Jylland", LocalDate.parse("1000-01-01"), 4);
        customers[5] = new Customer("Gandalf", "the Grey", "Middle Earth", LocalDate.parse("2015-01-01"), 5);
        customers[6] = new Customer("Julemand", "Claus", "Nordpolen", LocalDate.parse("2005-01-01"), 6);
        customers[7] = new Customer("Snehvide", "Æbledød", "Eventyrland", LocalDate.parse("2000-01-01"), 7);
        customers[8] = new Customer("Austin", "Powers", "Some place Groovy Baby", LocalDate.parse("1945-01-01"), 8);
        customers[9] = new Customer("Doctor", "Frankenstein", "Transylvanien", LocalDate.parse("2004-01-01"), 9);
        
        for(Customer c : customers) {
            mdb.addNewMember(c);
        }

    }
    
    public void generateMovies() {
        
        stock = new Stock();
        
        Movie[] movies = new Movie[15];
        //Title, ID-number, ageRating, hasLicence
        movies[0] = new BluRay("Smølferne", 0, 0, true);
        movies[1] = new BluRay("Smølferne 2", 1, 0, true);
        movies[2] = new BluRay("Smølferne 3", 2, 15, true);
        movies[3] = new BluRay("Smølferne 4", 3, 18, true);
        movies[4] = new BluRay("Smølferne 5", 4, 12, true);
        movies[5] = new Dvd("Smølferne 6", 5, 18, true);
        movies[6] = new Dvd("Smølferne 7", 6, 7, true);
        movies[7] = new Dvd("Smølferne 8", 7, 7, true);
        movies[8] = new Dvd("Smølferne 9", 8, 7, true);
        movies[9] = new Dvd("Smølferne 10", 9, 15, true);
        movies[10] = new Vhs("Smølferne 11", 10, 15, true);
        movies[11] = new Vhs("Smølferne 12", 11, 18, true);
        movies[12] = new Vhs("Smølferne 13", 12, 0, true);
        movies[13] = new Vhs("Smølferne 14", 13, 5, true);
        movies[14] = new Vhs("Smølferne 15", 14, 12, true);
        
        for(Movie m : movies) {
            stock.addToStock(m);
        }
        
    }
    
    public String writeReceipt(Customer customer) {
        
        boolean hasRentedMovies = false;
        
        StringBuilder sb = new StringBuilder();
        
        sb.append("#=========================================#\n| ");
        sb.append(customer.getFirstName());
        sb.append(" ");
        sb.append(customer.getLastName());
        sb.append("\n| ");
        sb.append("Membership ID: ");
        sb.append(customer.getMembershipID());
        sb.append("\n+-----------------------------------------+\n| ");
        sb.append("Has ");
        sb.append(LocalDate.now().format(DateTimeFormatter.ofPattern("dd. MMMM yyyy")));
        sb.append("\n| rented the following movie(s):\n|\n");
        for(Movie m : customer.getRentedMovies()) {
            if(m != null) {
                hasRentedMovies = true;
                sb.append("| ");
                sb.append(m.getTitle());
                sb.append("\tuntil\t");
                sb.append(m.getDueDate().format(DateTimeFormatter.ofPattern("dd. MMMM yyyy")));
                sb.append("\n");
            }
        }
        if(!hasRentedMovies) {
            sb.append("|\tNone\n");
        }
        sb.append("|\n+-----------------------------------------+\n| ");
        sb.append("Have a nice day! ");
        sb.append("|\n#=========================================#");
        String receipt = sb.toString();
        return receipt;
    }
    
}
