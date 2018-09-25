package People;

import java.time.LocalDate;

public class Customer extends Person {

    private final int MEMBERSHIP_ID;
    
    public int getMembershipID() {
        return MEMBERSHIP_ID;
    }
    
    public Customer(String name, String address, LocalDate dateOfBirth, int membership_ID) {
        super(name, address, dateOfBirth);
        this.MEMBERSHIP_ID = membership_ID;
    }

}
