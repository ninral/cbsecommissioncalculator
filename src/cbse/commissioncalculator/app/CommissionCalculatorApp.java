package cbse.commissioncalculator.app;

import java.util.Scanner;

import cbse.commissioncalculator.CommissionCalculator;

/**
 *
 * @author ninral
 */
public class CommissionCalculatorApp {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Input the sale price (RM).");
        double sale = scanner.nextDouble();
        
        System.out.println("Input the commission value (%).");
        double comm = scanner.nextInt();
        
        double commishAmount = CommissionCalculator.calculateCommission(sale, comm);
        System.out.println("Your commission amount is RM" + commishAmount);
    }
    
}
