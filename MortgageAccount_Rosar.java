//John Rosar
//COSC1437
//Lab5 part 2
//MortgageAccount_Rosar.java
//Data class

import java.lang.Math ;
import java.util.Random;


public class MortgageAccount_Rosar {
	//variables
	String L_Name;
	String F_Name;
	float principal;
	int number_Payments;
	float interest_rate;
	float monthly_Payment;
	float rate;

	public MortgageAccount_Rosar() {

	}
	public MortgageAccount_Rosar(String acctNumber, String L_Name, String F_Name, float principal,
			int number_Payments, float interest_rate) {
		this.acctNumber = acctNumber;
		this.L_Name = L_Name;
		this.F_Name = F_Name;
		this.principal = principal;
		this.number_Payments = number_Payments;
		this.interest_rate = interest_rate;
		calculateMonthlyPayment();
	}

	//methods
	public String getAccount_number() {
		return acctNumber;
	}
	public String getL_Name() {
		return L_Name;
	}
	public String getF_Name() {
		return F_Name;
	}
	public float checkCurrentPrincipal() {
		return principal;
	}
	public int getNum_of_payments() {
		return number_Payments;
	}
	public float checkInterestRate() {
		return interest_rate;
	}
	public float getMonthly_payment() {
		return monthly_Payment;
	}
	public float getinterest_Amount() {
		return interest_Amount;
	}
	public void setAccount_number(String acctNumber) {
		this.acctNumber = acctNumber;
	}
	public void setL_Name(String L_Name) {
		this.L_Name = L_Name;
	}
	public void setF_Name(String F_Name) {
		this.F_Name = F_Name;
	}
	public void setPrincipal(float principal) {
		this.principal = principal;
	}
	public void setNumber_Payments(int number_Payments) {
		this.number_Payments = number_Payments;
	}
	public void setInterest_rate(float interest_rate) {
		this.interest_rate = interest_rate;
	}
	public void setMonthly_payment(float monthly_Payment) {
		this.monthly_Payment = monthly_Payment;
	}
	public void setinterest_Amount(float interest_Amount) {
		this.interest_Amount = interest_Amount;
	}
	//random account number generate
	Random rand = new Random();
	int value1 = rand.nextInt(100000) + 10000; //in the range from 10000 to 99999
	int value2 = rand.nextInt(100000) + 10000;
	String acctNumber = String.valueOf(value1) + String.valueOf(value2) ;     

	float  interest_Amount = principal * ((interest_rate/100)/12);

	//process payment method
	float processPayment(float amount) {
		interest_Amount = principal * ((interest_rate/100)/12);
		principal=principal- (amount - interest_Amount);
		number_Payments = number_Payments - 1;
		return principal;
	}

	//to string
	public String toString() {
		return "MortgageAccount_Rosar [acctNumber=" + acctNumber + ", L_Name=" + L_Name + ", F_Name="
				+ F_Name + ", principal=" + principal + ", number_Payments=" + number_Payments + ", interest_rate="
				+ interest_rate + ", monthly_Payment=" + monthly_Payment + "]";
	}

	//monthly payment method
	float calculateMonthlyPayment() {
		rate = ((interest_rate/100)/12);
		monthly_Payment=(float) ((principal * rate * Math.pow( (1+rate) , number_Payments ))/ ( Math.pow((1+rate), number_Payments) -1)) ;
		return (float) monthly_Payment;
	}
	//account object
	MortgageAccount_Rosar openNewAccount(String acctNumber, String L_Name, String F_Name, float principal, float monthly_Payment,
			int number_Payments, float interest_rate) {
		MortgageAccount_Rosar account_object=new MortgageAccount_Rosar(acctNumber,L_Name,F_Name, principal,number_Payments, interest_rate);
		return account_object;
	}
	public void setinterest_Amount() {
		interest_Amount = principal * ((interest_rate/100)/12);

	}
}

