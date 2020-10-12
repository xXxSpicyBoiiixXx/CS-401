import java.util.Scanner; 

public class UseSafeDate00

{

	public class void main(String[] args)

	{
		int month, day, year;
		SafeDate theDate;
		boolean DateOK = false;
		Scanner scan = new Scanner(System.in);

		while(!DateOK)
		{
			System.out.println("Enter a date:");
			month = scan.nextInt();
			day = scan.nextInt();
			year = scan.nextInt();

		try
		{

		theDate = new SafeDate(month, day, year);
		DateOK = true;
		System.out.println(theDate + " is a safe date.");

		}
		
		catch(DateOutBoundsException DateOBExcept)
		
		{
		System.out.println(DateOBExcept.getMessage() + "\n");

		}

	}
}

// Some other program

} 
