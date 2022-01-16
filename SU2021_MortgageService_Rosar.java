//John Rosar
//COSC1437
//Lab5 part 2
//SU2021_MortgageService_Rosar.java
//Driver class

import java.util.Scanner;

// our menu system and output display
public class SU2021_MortgageService_Rosar {
	public static void main(String[] args) {
		int choice = -1;
		Scanner sc = new Scanner(System.in);
		MortgageAccount_Rosar access = null;
		while(choice != 0) {
			System.out.println("");
			System.out.println("");
			System.out.println("File: SU2021_MortgageService_Rosar.java");
			System.out.println("MENU OF MORTGAGE SERVICE – John Rosar");
			System.out.println("-----------------------------------------------------");
			System.out.println("1.Calculate the Mortage Monthly Payment"
					+ "\n2.Open Mortage Account"+
					"\n3.Check Interest Rate of current Mortage Account"+
					"\n4.Check Current Principal of current Mortage Account"+
					"\n5.Process Monthly Payment"+
					"\n0.Exit");
			choice = sc.nextInt();
			if(choice == 1) {
				access=new MortgageAccount_Rosar();
				System.out.print("Enter First name ");
				access.setF_Name(sc.next());
				System.out.print("Enter Last name ");
				access.setL_Name(sc.next());
				System.out.print("Enter number of mortgage payments ");
				access.setNumber_Payments(sc.nextInt());
				System.out.print("Enter your Principal ");
				access.setPrincipal(sc.nextFloat());;
				System.out.print("Enter your Interest Rate ");
				access.setInterest_rate(sc.nextFloat());
				access.calculateMonthlyPayment();
				System.out.println("");
				System.out.println("SU2021_MortgageService_Rosar.java");
				System.out.println("ESTIMATE MONTHLY PAYMENT – McKINLEY WHITE");
				System.out.println("-----------------------------------------------------");
				System.out.printf("%-20s %20s\n","Name:",(access.getL_Name()+", "+access.getF_Name()));
				System.out.printf("%-20s %20.3f\n","Principal:",access.checkCurrentPrincipal());
				System.out.printf("%-20s %20d\n","Number of payments:",access.getNum_of_payments());
				System.out.printf("%-20s %20s\n","Interest Rate:",String.valueOf(access.checkInterestRate())+"%");
				System.out.println("-----------------------------------------------------");
				System.out.printf("%-20s %20.3f\n","Monthly Payment:",access.getMonthly_payment());

			}
			else if(choice == 2) {
				access = new MortgageAccount_Rosar();
				System.out.print("Enter First name ");
				access.setF_Name(sc.next());
				System.out.print("Enter Last name ");
				access.setL_Name(sc.next());
				System.out.print("Enter number of payments ");
				access.setNumber_Payments(sc.nextInt());
				System.out.print("Enter Principal ");
				access.setPrincipal(sc.nextFloat());;
				System.out.print("Enter Interest Rate ");
				access.setInterest_rate(sc.nextFloat());
				access.calculateMonthlyPayment();
				System.out.println("");
				System.out.println("SU2021_MortgageService_Rosar.java");
				System.out.println("OPEN NEW ACCOUNT - John Rosar");
				System.out.println("-----------------------------------------------------");
				System.out.printf("%-20s %20s\n","Account Number:",access.getAccount_number());
				System.out.printf("%-20s %20s\n","Name:",(access.getL_Name()+", "+access.getF_Name()));
				System.out.printf("%-20s %20.3f\n","Principal:",access.checkCurrentPrincipal());
				System.out.printf("%-20s %20d\n","Number of payments:",access.getNum_of_payments());
				System.out.printf("%-20s %20s\n","Interest Rate:",String.valueOf(access.checkInterestRate())+"%");
				System.out.printf("%-20s %20.3f\n","Monthly Payment:",access.getMonthly_payment());
			}
			else if(choice == 3) {
				if(access == null) {
					System.out.println("The account is not created, cannot check Interest rate");
				}
				else {
					System.out.println("Enter account number: ");
					String account=sc.next();
					System.out.println("");
					System.out.println("SU2021_MortgageService_Rosar.java");
					System.out.println("CHECK INTEREST RATE  - John Rosar");
					System.out.println("-----------------------------------------------------");
					if(account.equals(access.getAccount_number())) {
						System.out.printf("%-20s %20s\n","Name:",(access.getL_Name()+", "+access.getF_Name()));
						System.out.printf("%-20s %20s\n","Account Number:",access.getAccount_number());
						System.out.printf("%-20s %20s\n","Interest Rate:",String.valueOf(access.checkInterestRate())+"%");
					}
					else {
						System.out.println("You enter the number: "+account);
						System.out.println("You enter not correct account number");
					}
				}
			}
			else if(choice == 4) {
				if(access == null) {
					System.out.println("The account is not created, cannot check Interest rate");
				}
				else {
					System.out.println("Enter account number: ");
					String account=sc.next();
					System.out.println("");
					System.out.println("SU2021_MortgageService_Rosar.java");
					System.out.println("CHECK CURRENT PRINCIPAL - John Rosar");
					System.out.println("-----------------------------------------------------");
					if(account.equals(access.getAccount_number())) {
						System.out.printf("%-20s %20s\n","Account Number:",access.getAccount_number());
						System.out.printf("%-20s %20s\n","Name:",(access.getL_Name()+", "+access.getF_Name()));
						System.out.printf("%-20s %20.3f\n","Current Principal:",access.checkCurrentPrincipal());
					}
					else {
						System.out.println("You enter the number: "+account);
						System.out.println("You enter not correct account number");
					}
				}
			}
			else if(choice == 5) {
				if(access == null) {
					System.out.println("The account is not created, cannot check Interest rate");
				}
				else {
					System.out.println("Enter account number: ");
					String account=sc.next();
					if(account.equals(access.getAccount_number())) {
						System.out.println("Enter amount you pay: ");
						float amount=sc.nextFloat();
						System.out.println("PROCESS MONTHLY PAYMENT");
						access.setinterest_Amount();
						System.out.println("");
						System.out.println("SU2021_MortgageService_Rosar.java");
						System.out.println("PROCESS MONTHLY PAYMENT – John Rosar");
						System.out.println("-----------------------------------------------------");
						System.out.printf("%-20s %20s\n","Account Number:",access.getAccount_number());
						System.out.printf("%-20s %20s\n","Name:",(access.getL_Name()+", "+access.getF_Name()));
						System.out.printf("%-20s %20.3f\n","Principal:",access.checkCurrentPrincipal());
						System.out.printf("%-20s %20d\n","Number of payments:",access.getNum_of_payments());
						System.out.printf("%-20s %19.3f%s\n","Interest rate:",access.checkInterestRate(),"%");
						System.out.printf("%-20s %20.3f\n","Monthly Payment:",access.getMonthly_payment());
						System.out.printf("%-20s %20.3f\n","Amount you pay:", amount);
						System.out.printf("%-20s %13.3f\n","Interest amount this month:",access.interest_Amount);
						System.out.println("-----------------------------------------------------");
						System.out.printf("%-20s %20s\n","Principal:",access.processPayment(amount));

					}
					else {
						System.out.println("");
						System.out.println("SU2021_MortgageService_Rosar.java");
						System.out.println("-----------------------------------------------------");
						System.out.println("You enter the number: "+account);
						System.out.println("You enter not correct account number");
					}
				}
			}
			else {
				System.out.println("Goodbye");
			}
		}
	}}
