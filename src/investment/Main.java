package investment;

import java.util.Scanner;
import java.text.*;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
        System.out.print("Enter your buying price: ");
        double buyingPrice = sc.nextDouble();
        
        int day = 1;
        double closingPrice = 0.1;
        
        while(true){
        
            System.out.println("Enter the closing price for the day " + day + " (any negative value to leave: ");
            closingPrice = sc.nextDouble();
            
            if(closingPrice < 0.0) break;
            
            double earnings = closingPrice - buyingPrice;
            
            if(earnings > 0.0){
                System.out.println("After day " + day + ", you earned " + df.format(earnings)  + " per share.");
            }
            else if(earnings < 0.0){
            
                System.out.println("After day " + day + ", you lost " + df.format(-earnings) + " per share.");
            }
            else {
                System.out.println("After day " + day + ", you have no earnings.");
            
            }
            
            day+=1;
            
            
        }
        sc.close();

    }

}
