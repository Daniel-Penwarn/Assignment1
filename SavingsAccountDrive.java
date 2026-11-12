package Assignment1;

import java.util.*;

public class SavingsAccountDrive{
    public static void main(String[] args) {
    SavingsAccount saver1 = new SavingsAccount(10002, 2000.00);
    SavingsAccount saver2 = new SavingsAccount(10003, 3000.00);
    
    SavingsAccount.setInterestRate(0.05);

    System.out.printf("%-8s %-10s %-10s%n", "Month", "Account#", "Balance");
    System.out.println("-----------------------------");
    
        for (int month = 0; month <=12; month++){
            if(month > 0 ) {
            saver1.addMonthlyInterest();
            saver2.addMonthlyInterest();
            }

            System.out.printf("%-8d %-10d $%-9.2f |", month, saver1.getAccountNumber(), saver1.getBalance());
            System.out.printf("%-8d %-10d $%-9.2f%n", month, saver2.getAccountNumber(), saver2.getBalance());
            System.out.println();
        
        }

        System.out.printf("Final balance of both accounts combined: %.2f%n", (saver1.getBalance() + saver2.getBalance()));
    }
}
    

