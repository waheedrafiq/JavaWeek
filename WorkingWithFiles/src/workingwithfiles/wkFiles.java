/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workingwithfiles;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MobileLaptopWR
 */
public class wkFiles{
    
    public List<Person> personList = new ArrayList<Person>();
    public List<Person> readPersonList = new ArrayList<Person>();
    
    public void addPerson(String name, String occupation, int Age)
    {
        Person p = new Person(name,occupation,Age);
        
        p.setNamE(name);
        p.setOccupatioN(occupation);
        p.setAge(Age);
        
       personList.add(p);
        
        
    }
    
    // print list of people
    public void PrintPersons(){
     
        for(Person per: personList)
        {
            System.out.println("Name :" + per.getNamE());
        }
      
        
        
    }
    
    public void save(String fileName) throws FileNotFoundException {
      
    // Person p = new Person();
    //String tmp = "Waheed";
    PrintWriter pw = new PrintWriter(new FileOutputStream(fileName));
    for (Person per : personList)
        pw.println(per.getNamE()+ "/" + per.getOccupatioN() + "/" +per.getAge());
    pw.close();
    
    System.out.println("File saved:");
    
    }// save files 
    
    @SuppressWarnings("empty-statement")
    public void Load() throws FileNotFoundException, IOException, ClassNotFoundException{
     
        
        String filepath = "C:\\javafile\\testjava.text";
        
        BufferedReader bufReader = new BufferedReader(new FileReader(filepath));
        
        String line = bufReader.readLine();
        
        while (line != null) {
           
            String[] parts = line.split("/");
            String part1 = parts[0];
            String part2 = parts[1];
            int part3 = Integer.parseInt(parts[2]);
            Person nPerson = new Person(part1,part2,part3);
            
            readPersonList.add(nPerson);
            line = bufReader.readLine(); 
        } //end of while 
        bufReader.close();
         
        for(Person per: readPersonList)
        {
            System.out.println("Reading.." + per.getNamE());
            
        }
        
    }
    

    
}// end of class 
