package People;

import java.time.LocalDate;
import java.time.Period;

public abstract class Person {
    private String name;
    private String address;
    private LocalDate dateOfBirth;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        
    public Person(String name, String address, LocalDate dateOfBirth) {
        
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        
    }
    
}