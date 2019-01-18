import java.util.Scanner;

public class VendingMachine {
	
	
	public static void main(String[] args) {
		// Stating to the customer that he/she can Exit at any time.
		System.out.println("Press '0' at any time to cancel\n");
		// Declaring the bills that are allowed in this Vending Machine.
		System.out.println("Accepted bills are: 1$, 5$, or 10$");
		// Declaring The Vending Machine's options.
		String [] options = {"1. Chips","2. Juice","3. Choclate","4. Sprite","5. Water"};
		// Setting prices for the options declared above
		double[] fees = {1.5,1.75,2.25,1.5,1.25};
		// Print out the options of the Vending Machine
		for(int i=0;i<options.length;i++)
			System.out.println(options[i]+ " "+fees[i]+"$");
		
		System.out.print("Please choose one of the options: ");
		// Printing the method.
		method();
		// Ask the user for another purchase.
		System.out.println("Would you like another purchase? i.e. 'yes','no'");
				
		Scanner sc = new Scanner(System.in);
		String k = sc.nextLine();
		while(k.equalsIgnoreCase("yes"))
		{
			System.out.println("Press '0' at any time to cancel\n");
			System.out.println("Accepted bills are: 1$, 5$, 10$");
			for(int i=0;i<options.length;i++)
				System.out.println(options[i]+ " "+fees[i]+"$");
			// Listening to the user's option
			System.out.print("Please choose one of the options: ");
			method();
		}
		if (k.equalsIgnoreCase("no"))
			System.out.println("Have a good day");
		else
			{
				System.out.println("Invalid response");
				System.out.println("Would you like another purchase? i.e. 'yes','no'");
				
				
			}
		
}

	public static  void method() {
		String [] options = {"1. Chips","2. Juice","3. Choclate","4. Sprite","5. Water","0. EXIT"+"\n"};
		double[] fees = {1.5,1.75,2.25,1.5,1.25};
		double remaining=0,moneyPaid=0,credit=0;
		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();
		//compare the user's options with one of the cases
		switch(k) {
		case 1 :
		{
			System.out.println("Price is: " + fees[0]);
			System.out.println("Credit is: " + credit);
		}
			break;
		case 2:
		{
			System.out.println("Price is: " + fees[1]);
			System.out.println("Credit is: " + credit);
		}break;
		case 3:
		{
			System.out.println("Price is: " + fees[2]);
			System.out.println("Credit is: " + credit);
		}break;
		case 4:
		{
			System.out.println("Price is: " + fees[3]);
			System.out.println("Credit is: " + credit);
		}break;
		case 5:
		{
			System.out.println("Price is: " + fees[4]);
			System.out.println("Credit is: " + credit);
		}break;
		case 0:
		{
			System.out.println("Have a good day :)");
		}			System.exit(0);

		default :
			System.err.println("Invalid response");
		}
		
		System.out.print("Please Insert Your money: ");
		// listen to how much the user's paid
		moneyPaid = scan.nextInt();
		// while the user did not request to EXIT keep looping until he/she moneyPaid the right amount of money 
		while (k !=0)
		{
			// The user should Insert the right amount of money indicated above
			if (moneyPaid ==1 || moneyPaid==5 || moneyPaid == 10)
			{
			remaining=fees[k-1]-moneyPaid;
			// let the user continue to moneyPaid until the fees are fully paid 
			while(remaining >0)
			{	
				if (moneyPaid !=0)
				{
					credit=credit+moneyPaid;
					System.out.print("Credit: "+credit+"\n"+"The remaining amount is: "+remaining+"\n");
					moneyPaid = scan.nextInt();
					remaining=remaining-moneyPaid;
				}
				else
				{
					System.out.println("Your remaining money is: "+ remaining+"\nHave a good day :)");
					System.exit(0);

				}
				
			}
			// If the user paid extra then the Vending Machine going to return the remaining amount of user's money
			if(remaining < 0)
			{
				remaining=remaining *-1;
				System.out.println("Your remaining money is: "+ remaining);
				System.out.println("Thank you for your purchus");
				break;
			}
			// if the user paid exactly the right amount of money
			else if (remaining == 0)
			{
				System.out.println("Thank you for your purchus");break;
			}
			

		}
			//	A reminder for the user about the accepted bills
		else 
		{
			if(moneyPaid !=0)
				{
				System.out.println("Please insert either 1$, 5$, or 10$ or Press #0 to EXIT");
				moneyPaid = scan.nextInt();
				}
			else
				{
					System.out.println("Have a good day :)");
					System.exit(0);

				}
		
			
		}
		}
		
	}
	



}
