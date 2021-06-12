//package Ksolves.Internship.BankIntrest.B;
import  java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
class BankData{
	public int interest(int x) {
		int inter=0;
		if(x>=0 && x<1000) {
			inter=(int)(x*0.01);
		}
		else if(x>=1000 && x<5000) {
			inter=(int)(x*0.02);
		}
		else if(x>5000) {
			inter=(int)(x*0.03);
			
		}
		return inter;
	}
}
public class Bank2 {
	
	public static void main(String[] args) {
		BankData b=new BankData();
		File f=new File("E:\\KSOLVESCODES\\Bank1.csv");
		try{
			FileWriter write=new FileWriter("E:\\KSOLVESCODES\\Bank.csv");
			Scanner scan=new Scanner(f);
			while(scan.hasNextLine()) 
			{
				String rowdata=scan.nextLine();
				String row="";
				row+=row.valueOf(rowdata+",");
				String data[]=rowdata.split(",");
				int interest= b.interest(Integer.parseInt(data[1]));
				rowdata+=String.valueOf(interest);
				write.append(rowdata);
				write.append("\n");
				
			}
			scan.close();
			write.close();
			System.out.println("success");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
