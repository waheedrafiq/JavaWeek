/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personaldetails;

/**
 *
 * @author waheedrafiq
 */
public class PersonalDetails {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Code example from Lesson 1 IDE and Java Introduction 
        // Task Personal details 
        
        // Declare variables  note string is in uppercase 
        String fname = "Waheed"; // first name
        String lastname = "Rafiq"; // last name
        short age = 18; // I wish .... 
        int houseNumber = 33; 
        char gender = 'M';
        double wage = 300.568; 
        
        
        System.out.println("-----------------------------");
        System.out.println("    Personal Details          ");
        System.out.println("------------------------------");
        System.out.println("");
        
        System.out.println("Your name is: " + fname + " " + lastname);
        System.out.println("You are : " + age + " years old :)  ");
        System.out.println("Your gender is : " + gender);
        System.out.println("You earn £ " + wage);
        
        
        
        
        
    }
    
}
