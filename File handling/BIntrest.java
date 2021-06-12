/*
 PART A
A bank wants to introduce a new bank account with variable rates of interest depending on how much money is in the account.

 The interest rate bands are as follows:
₹0 to ₹1000     :1%
₹1000 to ₹5000  : 2%
₹5000+          : 3% 

For example: how much interest should I receive if I have ₹500 in the account (the answer is ₹5, i.e. 1% of ₹500).

  */

//package Ksolves.Internship.BankIntrest.A;
import java.util.*;
class CalsBankInt{

	double Balance;
	CalsBankInt(double Balance){
		this.Balance=Balance;
	}
	public double ReturnedAmount() {
		if(Balance>=0 && Balance<1000)
		return Balance*0.01;
		else if(Balance>=1000 && Balance<5000)
		return Balance*0.02;
		
		return Balance*0.03;
	}
}
public class BIntrest {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("ENTER BANK BALANCE TO KNOW YOUR INTREST:");
		double Balance=scan.nextDouble();
		CalsBankInt BankObj=new CalsBankInt(Balance);
		double interest =BankObj.ReturnedAmount();
		System.out.println("Balance: "+Balance+"\n"+"Interest: "+interest);
		scan.close();
	}
}