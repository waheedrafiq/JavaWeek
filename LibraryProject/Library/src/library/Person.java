/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

/**
 *
 * @author MobileLaptopWR
 */
public class Person {
    
    private String emailAddress;
    private String fullName;
    private String password;

   
    public Person(String fName, String emailAddress, String password)
    {
        this.fullName = fName;
        this.emailAddress = emailAddress;
        this.password = password;
        
    }
    
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    

    
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    
}
