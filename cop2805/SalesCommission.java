/*
 * Author: Mauricio Lopez Alvarez  **
 * Date written: January 10th, 2024 **
 * Purpose:...Homework 1           **
*/

package cop2805;

public class SalesCommission 
{
    public static void main(String[] args) 
    {
        // Variable
        double sales = 1000.00;
        
        // Output
        System.out.println("Sales \t\t Income");
        for(int i = 0; i < 20; i++)
        {
            System.out.printf("$%0,1.2f", sales);
            System.out.printf("\t $%0,1.2f\n", computeIncome(sales));
            sales+= 1000;
        } // end for
    } // end main
    
    public static double computeIncome(double salesAmount)
    {
        // Variables
        double result = 0.0;
        double baseSalary = 5000.00;
        double commissionRate = 0.0;
        int tierOne = 400;
        double tierTwo;
       
        // Validation
        if(salesAmount <= 5000)
        {
            // Calculation
            commissionRate = 0.08;
            result = (salesAmount - 0) * commissionRate + baseSalary;
        } // end Tier 1
     
        
        // Validation
        if( salesAmount > 5000 && salesAmount <= 10000)
        {
            // Calculation    
            commissionRate = 0.10;
            result = ((salesAmount - 5000) * commissionRate) + (tierOne + baseSalary);
                         
        } // end Tier 2
        
        // Validation
       if(salesAmount > 10000)
       {
            // Calculation
            commissionRate = 0.12;
            tierTwo = (10000 - 5000) * 0.1;
            result = ((salesAmount - 10000) * commissionRate) + (tierOne + tierTwo + baseSalary);

       } // end Tier 3   
        return result;
    } // end computeIncome method
} // end SalesCommission class
