package testing_codes;

import java.util.*;

public class atm {
	private static int type;
	static double balance = 1000.0;
	private static Scanner sc;
	private static String withdrawAmount;

	public static void main(String[] args) {
		System.out.println("++++++++++Welcome to the ATM project!+++++++++");
		System.out.print("1. enter your customer number : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		System.out.print("2. enter your PIN number : ");
		Scanner num = new Scanner(System.in);
		int b = num.nextInt();

		System.out.println("++++++++++select the account you want to access!+++++++++");
		System.out.println("type 1 - checking Account ");
		System.out.println("type 2 - Saving Account ");
		System.out.println("type 3 - Exit");
		System.out.print("choice : ");
		Scanner menuInput = new Scanner(System.in);
		type = menuInput.nextInt();
		switch (type) {
		case 1:
			getchecking();
			break;
		case 2:
			getSaving();
			break;
		case 3:
			System.out.print("thank you for using this ATM ! bye.");
			break;
		default:
			System.out.print("\n" + "Invalid choice" + "\n");

		}
	}

	private static void getchecking() {
		// TODO Auto-generated method stub
		System.out.println("checking Account :");
		System.out.println("type 1 - view balance");
		System.out.println("type 2 - withdraw funds");
		System.out.println("type 3 - deposite funds");
		System.out.println("type 4 - Exit");
		System.out.print("choice : ");

		Scanner menuInput = new Scanner(System.in);
		type = menuInput.nextInt();
		switch (type) {
		case 1:
			System.out.print("checking Account balance : $" + balance + "\n");
			getchecking();
			break;

		case 2:
			System.out.print("enter your amount to withdraw : $" + withdrawAmount);
			Scanner n1 = new Scanner(System.in);
			sc.nextLine();
			double withdrawAmount = sc.nextDouble();
			System.out.print(withdrawAmount);

			if (withdrawAmount > 0 && withdrawAmount <= balance) {
				balance -= withdrawAmount;
				System.out.print("withdraw is successful! your balance is : $" + balance);
				getchecking();
			} else if (withdrawAmount > balance) {
				System.out.println("insufficient balanced. transaction failed.");
			} else {
				System.out.println("Invalid withdraw amount. try again!");
			}
			break;

		case 3:
			System.out.print("enter your amount to deposite : $ ");
			double depositeAmount = menuInput.nextDouble();
			if (depositeAmount > 0) {
				balance += depositeAmount;
				System.out.print("deposite successful! your new balence is : $" + balance);
			} else {
				System.out.println("invalid deposite ! plz try again.");
			}
			break;
		case 4:
			System.out.println("thank you for using the ATM. GOODBYE!");
			break;
		default:
			System.out.println("invalid choice! plz try again");

			break;
		}
	}

	private static void getSaving() {
		// TODO Auto-generated method stub
		System.out.println("saving Account :");
		System.out.println("type 1 - view balance");
		System.out.println("type 2 - withdraw funds");
		System.out.println("type 3 - deposite funds");
		System.out.println("type 4 - Exit");
		System.out.print("choice : ");
		Scanner menuInput = new Scanner(System.in);
		type = menuInput.nextInt();
		switch (type) {
		case 1:
			System.out.print("checking Account balance : $" + balance + "\n");
			getchecking();
			break;

		case 2:
			System.out.print("enter your amount to withdraw : $" + withdrawAmount);
			double withdrawAmount = sc.nextDouble();
			System.out.print(withdrawAmount);

			if (withdrawAmount > 0 && withdrawAmount <= balance) {
				balance -= withdrawAmount;
				System.out.print("withdraw is successful! your balance is : $" + balance);
				getchecking();
			} else if (withdrawAmount > balance) {
				System.out.println("insufficient balanced. transaction failed.");
			} else {
				System.out.println("Invalid withdraw amount. try again!");
			}
			break;

		case 3:
			System.out.print("enter your amount to deposite : $");
			double depositeAmount = sc.nextDouble();
			if (depositeAmount > 0) {
				balance += depositeAmount;
				System.out.print("deposite successful! your new balence is : $" + balance);

			} else {
				System.out.println("invalid deposite ! plz try again.");

			}
			break;

		case 4:
			System.out.println("thank you for using the ATM. GOODBYE!");
			break;
		default:
			System.out.println("invalid choice !plz try again.");
			break;

		}
	}

}
