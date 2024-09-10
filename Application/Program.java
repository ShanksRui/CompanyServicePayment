package Application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Model.Entities.Contract;
import Model.Entities.Installment;
import Model.Services.ContractServices;
import Model.Services.PaypalService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
       try {
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Enter the Contract data");
		System.out.print("Number:");
		int number = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(),f1);	
		System.out.print("Value of Contract:");
		Double value = sc.nextDouble();
		Contract contract = new Contract(number, date, value);
		
        System.out.print("enter the number of  Installment");
		int n = sc.nextInt();
		System.out.println();
		System.out.println("Installment:");
		ContractServices service = new ContractServices(new PaypalService());
		service.ProcessContract(contract, n);
	    System.out.println(contract.toString());
       }catch(DateTimeParseException e) {
    	System.out.println("Error:"+e.getMessage());
       }
        
	}
		
}
