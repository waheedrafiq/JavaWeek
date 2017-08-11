/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

/**
 *
 * @author MobileLaptopWR
 */
public class BlackJack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CheckBlackJack bj = new CheckBlackJack();
        
        bj.blackjack(18, 21);
        bj.blackjack(20, 18);
        bj.blackjack(22, 22);
        
    }
    
}
