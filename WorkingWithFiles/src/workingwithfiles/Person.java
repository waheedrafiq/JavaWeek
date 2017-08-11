/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workingwithfiles;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MobileLaptopWR
 */
public class Person extends wkFiles{
    
   ; // 
    
    private String namE, occupatioN;
    private int age;

    // constructor 
    Person(String name,String occupation, int age)
    {
        this.namE = name;
        this.occupatioN = occupation;
        this.age= age;
        
        
    }// end of person
    
    Person(){
     // do nothing ...    
    }
    
    public String getNamE() {
        return namE;
    }

    public void setNamE(String namE) {
        this.namE = namE;
    }

    public String getOccupatioN() {
        return occupatioN;
    }

    public void setOccupatioN(String occupatioN) {
        this.occupatioN = occupatioN;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
    
}// end person. 
