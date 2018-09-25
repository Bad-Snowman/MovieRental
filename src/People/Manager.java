package People;

import java.time.LocalDate;

public class Manager extends Person {

    private final int MANAGER_ID;
    
    public int getEmployeeID() {
        return MANAGER_ID;
    }
    
    public Manager(String firstName, String lastName, String address, LocalDate dateOfBirth, int manager_ID) {
        super(firstName, lastName, address, dateOfBirth);
        this.MANAGER_ID = manager_ID;
    }

}
