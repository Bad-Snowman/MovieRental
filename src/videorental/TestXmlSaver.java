package videorental;

import People.Person;

/**
 * Test XmlSaver
 */

public class TestXmlSaver {
	
    public static void main(String[] args) {
        Person[] person = new Person[3];
        
        person[0] = new Person();
        person[0].setName("Frede");
        person[0].setDateOfBirth("1968-03-24");
        person[0].getAddress().setAddress("Nørrebrogade");
        person[0].setID(0);
        
        person[1] = new Person();
        person[1].setName("Jørgen");
        person[1].setDateOfBirth("1973-11-03");
        person[1].getAddress().setAddress("Islands Brygge");
        person[1].setID(1);
        
        person[2] = new Person("Rasmus", "2007-11-11", "Somewhere", 2);
        person[3] = new Person("Mathias", "1991-08-17", "Et dejligt sted", 2);
        person[4] = new Person("Thomas", "1991-08-17", "Skuldelev Strand", 2);
        
        XmlSaver.arrayDump(person, "personer.xml");

        Person[] members = XmlSaver.arrayLoad("personer.xml");

        //System.out.println(members[2].getName());
        //System.out.println(members[2].getAddress());
        //System.out.println(members[0].getAge());
        //System.out.println(members[1].getAge());
        System.out.println(members[2].getID());
	
    }

}