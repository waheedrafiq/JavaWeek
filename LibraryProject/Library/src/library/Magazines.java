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
public class Magazines  extends Items {
    private  String MagTitle;
    private int IssueNo;

    public Magazines(String itemname, String itemdetails, String itemtype, int itemcode
    ,String magtitle, int issueno){
        super(itemname,itemdetails,itemtype,itemcode);
        
        this.MagTitle = magtitle;
        this.IssueNo = issueno;
    }
    
    @Override
    public void PrintItems(){
        
    }
    public String getMagTitle() {
        return MagTitle;
    }

    public void setMagTitle(String MagTitle) {
        this.MagTitle = MagTitle;
    }

    public int getIssueNo() {
        return IssueNo;
    }

    public void setIssueNo(int IssueNo) {
        this.IssueNo = IssueNo;
    }
    
    
}
