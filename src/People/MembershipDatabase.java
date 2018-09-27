package People;

import java.util.ArrayList;

public class MembershipDatabase {

    private ArrayList<Customer> members;                                        //An arraylist of the members.
    
    //Returns the store's entire stock of Movies.
    public ArrayList<Customer> getMembers() {
        return members;
    }
    
    //Checks if the Movie is in stock.
    public boolean isMember(Customer customer) {
        
        for(int i = 0; i < members.size(); i++) {                               //Looping through all members.
            if(customer.getMembershipID() == members.get(i).getMembershipID()) {//Checking if the ID matches the i'th member's ID.
                return true;                                                    //The member is found.
            }
        }
        return false;                                                           //If this line is reached, then the member is not found.
        
    }
    
    //Returns member from ID number.
    public Customer getMember(int membershipID) {
        
        for(int i = 0; i < members.size(); i++) {                               //Looping through all members.
            if(members.get(i).getMembershipID() == membershipID) {              //Checking if the ID matches the i'th member's ID.
                return members.get(i);                                          //The member is found.
            }
        }
        return null;                                                            //If this line is reached, then the member is not found.
        
    }
    
    //Adds a new customer to the database.
    public void addNewMember(Customer customer) {

        members.add(customer);
        
    }
    
    //Removes a customer from the membership database.
    public void removeMember(Customer customer) {
        
        for(int i = 0; i < members.size(); i++) {                               //Looping through all members.
            if(customer.getMembershipID() == members.get(i).getMembershipID()) {//Checking if the ID matches the i'th member's ID.
                members.remove(i);
            }
        }
        
    }
    
    //Removes a customer from the membership database. Given their ID number.
    public void removeMember(int membershipID) {
        
        for(int i = 0; i < members.size(); i++) {                               //Looping through all members.
            if(members.get(i).getMembershipID() == membershipID) {              //Checking if the ID matches the i'th member's ID.
                members.remove(i);
            }
        }
        
    }

    //Constructor
    public MembershipDatabase() {
        this.members = new ArrayList<>();                                       //The arraylist of members is initialized.
    }
    
}
