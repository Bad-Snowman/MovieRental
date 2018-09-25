package People;

import java.time.LocalDate;

public class Employee extends Person {

    private final int EMPLOYEE_ID;
    
    public int getEmployeeID() {
        return EMPLOYEE_ID;
    }
    
    public Employee(String firstName, String lastName, String address, LocalDate dateOfBirth, int employee_ID) {
        super(firstName, lastName, address, dateOfBirth);
        this.EMPLOYEE_ID = employee_ID;
    }

}
