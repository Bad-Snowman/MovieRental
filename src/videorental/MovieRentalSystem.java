package videorental;

import MovieStock.*;
import People.Customer;
import People.Employee;
import People.Manager;

import java.time.LocalDate;
import java.util.Scanner;

public class MovieRentalSystem {

    Stock stock;

    Employee employee;
    Manager manager;

    public static void main(String[] args) {
        MovieRentalSystem mrs = new MovieRentalSystem();

        mrs.generateMovies();


        //Movie test = new BluRay("Harry Potter BR", 0, 0, true);
        /*
        Movie test2 = new BluRay("Harry Potter BR", 99, 0, true);
        System.out.println(mrs.stock.isStocked(test));
        System.out.println(mrs.stock.isStocked(test2));
        */

        mrs.newBluRay();

        Movie test2 = new BluRay("The Hunger Games", 99, 18, true);
        System.out.println(mrs.stock.isStocked(test2));

    }

    public void generatePeople() {

        employee = new Employee("John", "Doe", "Hogwarts", LocalDate.parse("1928-04-01"), 7);
        manager = new Manager("Jane", "Doe", "Isengard", LocalDate.parse("1728-04-01"), 1);

        Customer[] customers = new Customer[10];
        customers[0] = new Customer("Rasmus", "Sørensen", "Et rart sted", LocalDate.parse("2007-11-11"), 0);
        customers[1] = new Customer("Mathias", "Hellesøe", "Et dejligt sted", LocalDate.parse("1971-03-20"), 1);
        customers[2] = new Customer("Thomas", "Dahl", "Skuldelev Strand", LocalDate.parse("1991-08-17"), 2);
        customers[3] = new Customer("Gargamel", "Ond", "Smølfeland", LocalDate.parse("2000-01-01"), 3);
        customers[4] = new Customer("Lars", "Larsen", "Jylland", LocalDate.parse("2000-01-01"), 4);
        customers[5] = new Customer("Gandalf", "the Grey", "Middle Earth", LocalDate.parse("2000-01-01"), 5);
        customers[6] = new Customer("Julemand", "Claus", "Nordpolen", LocalDate.parse("2000-01-01"), 6);
        customers[7] = new Customer("Snehvide", "Æbledød", "Eventyrland", LocalDate.parse("2000-01-01"), 7);
        customers[8] = new Customer("Austin", "Powers", "Some place Groovy Baby", LocalDate.parse("2000-01-01"), 8);
        customers[9] = new Customer("Doctor", "Frankenstein", "Transylvanien", LocalDate.parse("2000-01-01"), 9);

    }

    public void generateMovies() {

        stock = new MovieStock(30);

        Movie[] movies = new Movie[15];
        //Title, ID number, ageRating, hasLicence
        movies[0] = new BluRay("Harry Potter BR", 0, 0, true);
        movies[1] = new BluRay("The Lord Of The Rings", 1, 0, true);
        movies[2] = new BluRay("Smølferne", 2, 15, true);
        movies[3] = new BluRay("Smølferne", 3, 18, true);
        movies[4] = new BluRay("Smølferne", 4, 12, true);
        movies[5] = new Dvd("Harry Potter DVD", 5, 18, true);
        movies[6] = new Dvd("The Lord Of The Rings", 6, 7, true);
        movies[7] = new Dvd("Smølferne", 7, 7, true);
        movies[8] = new Dvd("Smølferne", 8, 7, true);
        movies[9] = new Dvd("Smølferne", 9, 15, true);
        movies[10] = new Vhs("Harry Potter Vhs", 10, 15, true);
        movies[11] = new Vhs("The Lord Of The Rings", 11, 18, true);
        movies[12] = new Vhs("Smølferne", 12, 0, true);
        movies[13] = new Vhs("Smølferne", 13, 5, true);
        movies[14] = new Vhs("Smølferne", 14, 12, true);


        for(int i = 0; i < movies.length; i++) {
            stock.addStock(movies[i]);
        }



    }

    public void newBluRay() {

        Scanner console = new Scanner(System.in);

        System.out.println("What is the title?");
        String title = console.nextLine();
        System.out.println("What is the ID-number?");
        int uniqueID = console.nextInt();
        System.out.println("What is the age rating??");
        int ageRating = console.nextInt();
        System.out.println("Do we have a license?");
        boolean hasLicense = console.nextBoolean();

        Movie movie = new BluRay(title, uniqueID, ageRating, hasLicense);

        stock.addStock(movie);

        System.out.println(title + " " + uniqueID + " " + ageRating + " " + hasLicense);


    }
    
}
