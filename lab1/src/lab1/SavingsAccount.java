package lab1;
/* Savings Account Class
 * 
 * This File contains a class that can be used to store bank information and calculate monthly interest
 * Curtis Penrose
 * 200346024
 */
public class SavingsAccount {
private double savingsBalance;
public static double annualInterestRate;
public SavingsAccount(double yourBalance)
{
	savingsBalance=yourBalance;
	annualInterestRate=0;
}
public double calculateMonthlyInterest()
{
	savingsBalance+= savingsBalance*annualInterestRate/12;
	return savingsBalance;
	//method calculates monthly interest and adds it to the balance
	//method returns the new savings balance
}
public static void modifyInterestRate(double IR)
{
	//IR is new annual interest rate
	SavingsAccount.annualInterestRate=IR;
}
public static void main(String [] Args)
{
SavingsAccount One = new SavingsAccount(2000)	;
SavingsAccount Two = new SavingsAccount(3000);
modifyInterestRate(0.04);
System.out.println("One's new balance is: " + One.calculateMonthlyInterest());
System.out.println("Two's new balance is: " +Two.calculateMonthlyInterest());
modifyInterestRate(0.05);
System.out.println("One's new balance is: " +One.calculateMonthlyInterest());
System.out.println("Two's new balance is: " +Two.calculateMonthlyInterest());
}
}