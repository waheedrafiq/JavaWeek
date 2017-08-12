/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author MobileLaptopWR
 */
public class Journals extends Items{
    
    private String journalTitle;
    private double DOInumber; 

    public Journals(String itemname, String itemdetails, String itemtype, int itemcode,String journaltitle
    ,double DOInumber){
        super(itemname, itemdetails ,itemtype,itemcode);
        this.journalTitle = journaltitle;
        this.DOInumber = DOInumber;   
    }
    
   @Override
   public void PrintItems(){
       
   }
  
    
    public String getJournalTitle() {
        return journalTitle;
    }

    public void setJournalTitle(String journalTitle) {
        this.journalTitle = journalTitle;
    }

    public double getDOInumber() {
        return DOInumber;
    }

    public void setDOInumber(double DOInumber) {
        this.DOInumber = DOInumber;
    }
    
    
    
}
