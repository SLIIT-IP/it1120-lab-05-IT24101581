import java.util.Scanner;

public class Lab5Q3{
	public static void main(String[] args) {
		
		final double ROOM_CHARGE_PER_DAY = 48000.00;
		final int DISCOUNT_10_DAYS_MIN = 3;
		final int DISCOUNT_20_DAYS_MIN = 5;
		final double DISCOUNT_10_PERCENT = 0.10;
		final double DISCOUNT_20_PERCENT = 0.20;
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the start date (1-31): ");
		int startDate = scanner.nextInt();
		
		System.out.println("Enter the end date (1-31): ");
		int endDate = scanner.nextInt();
		
		if (startDate < 1 || startDate > 31 || endDate< 1 || endDate > 31) {
			System.out.println("Error: Start date and the end date cannot be less than 1 or greater than 31.");
			return;
		}
		
		if (startDate >= endDate) {
			System.out.println("Error: Start date should be less than the end date.");
			return;
		}
		
		int daysReserved = endDate - startDate;
		
		double totalCost = daysReserved * ROOM_CHARGE_PER_DAY;
		double discount = 0.0;
		
		if (daysReserved >= DISCOUNT_20_DAYS_MIN) {
			discount = totalCost * DISCOUNT_20_PERCENT;
		}else if (daysReserved >= DISCOUNT_10_DAYS_MIN) {
			discount = totalCost * DISCOUNT_10_PERCENT;
		}
		
		double totalAmountToPay = totalCost - discount;
		
		System.out.println("Number of days reserved: " + daysReserved);
        System.out.println("Total amount to be paid: Rs. " + totalAmountToPay);
	
	}
}