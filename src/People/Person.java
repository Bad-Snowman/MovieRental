package People;

import java.time.LocalDate;
import java.time.Period;

public abstract class Person {
    private String firstName;
    private String lastName;
    private String address;
    private LocalDate dateOfBirth;
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    } 
    
    public int getAge() {
        
        LocalDate today = LocalDate.now();
        LocalDate dob = dateOfBirth;
        Period age = Period.between(dob, today);
        
        return age.getYears();
        
    }
        
    public Person(String firstName, String lastName, String address, LocalDate dateOfBirth) {
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        
    }
    
}