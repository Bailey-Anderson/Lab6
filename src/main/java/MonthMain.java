/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baileyanderson
 */
public class MonthMain {
    public static void main(String[] args) 
    {
        Month month1 = new Month(6);
        Month month2 = new Month(9);

        
        System.out.println("Month 1's name is: " + month1);
        System.out.println("Month 2's name is: " + month2);
        
        System.out.println("Are Month 1 and Month 2 the same? " + month1.equals(month2));
       
    }
}
