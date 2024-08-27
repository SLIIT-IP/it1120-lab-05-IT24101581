import java.util.Scanner;

public class Lab5Q2{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number of new member introduced (should be >=0):");
		int newMembers = scanner.nextInt();
	
	
		if (newMembers < 0){
		System.out.println("Invalid number of new members. Please enter a non-negative number.");
		} else {
			String prize;
		
			switch(newMembers) {
				case 0:
					prize = "No prize";
					break;
				case 1:
					prize = "Pen";
					break;
				case 2:
					prize = "Umbrella";
					break;
				case 3:
					prize = "Bag";
					break;
				case 4:
					prize = "Travelling chair";
					break;
				default:
					prize = "Headphones"; //for 5 or more new members
					break;
			}
		
			System.out.println("The prize for introducing "+ newMembers + "new member(s) is: " + prize);
		}
	
		scanner.close();

	}			
	
}