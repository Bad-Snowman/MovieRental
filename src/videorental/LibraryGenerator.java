package videorental;

import People.*;
import java.time.LocalDate;

public class LibraryGenerator {
	
    public static void main(String[] args) {
        
        Employee employee = new Employee("John", "Doe", "Hogwarts", LocalDate.parse("1928-04-01"), 7);
        Manager manager = new Manager("Jane", "Doe", "Isengard", LocalDate.parse("1728-04-01"), 1);
        
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

}