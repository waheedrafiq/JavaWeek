/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.util.ArrayList;

/**
 *
 * @author MobileLaptopWR
 */
public class Person implements LibraryManager {
    public ArrayList<Person> personList = new ArrayList<>(); 
    public String emailAddress;
    public String fullName;
    public String password;

   
    public Person(String fName, String emailAddress, String password)
    {
        this.fullName = fName;
        this.emailAddress = emailAddress;
        this.password = password;
        
    }
    
    
    @Override 
     public void RegisterPerson(String fName, String emailAddress, String password){
         
        Person p = new Person(fName,emailAddress,password);
        
        p.setFullName(fName);
        p.setEmailAddress(emailAddress);
        p.setPassword(password);
        
        personList.add(p);
     }
  @Override 
    public String toString() {
        
        return "Name =" + this.fullName + " :: Email" + this.emailAddress + 
                " sucessfully register";
        
    }
    public void PrintPersons(){
        
        for(int i=0; i < personList.size(); i++)
             {
                 System.out.println("Printing :");
                 System.out.println(personList.get(i).getFullName()
                 + " " + personList.get(i).getEmailAddress() );

             }  
    }// end of printing 
    
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
