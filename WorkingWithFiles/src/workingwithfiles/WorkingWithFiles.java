/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workingwithfiles;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MobileLaptopWR
 */
public class WorkingWithFiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Person p = new Person("Sarah","HouseWife",36);
        
        
        p.addPerson("Matt", "Student", 23);
        p.addPerson("Chris", "Trainee", 23);
        p.addPerson("John", "Engineer", 34);
        p.addPerson("Paul", "Engineer", 19);
        
        p.PrintPersons();
        
        p.save("C:\\javafile\\testjava.text");
        
       p.Load();
       
    }
    
}
