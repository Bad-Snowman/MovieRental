package videorental;

import People.Customer;
import java.time.LocalDate;

/**
 * Test XmlSaver
 */

public class TestXmlSaver {
	
    public static void main(String[] args) {
        Customer[] customers = new Customer[3];
        
        customers[2] = new Customer("Rasmus", "Sørensen", "Somewhere", LocalDate.parse("2007-11-11"), 2);
        customers[3] = new Customer("Mathias", "Hellesøe", "Et dejligt sted", LocalDate.parse("1971-03-20"), 2);
        customers[4] = new Customer("Thomas", "Dahl", "Skuldelev Strand", LocalDate.parse("1991-08-17"), 2);
        
        XmlSaver.arrayDump(customers, "customers.xml");

        Customer[] members = XmlSaver.arrayLoad("customers.xml");

	
    }

}