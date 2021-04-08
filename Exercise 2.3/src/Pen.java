import java.util.Scanner;

public class Pen {
		
		Scanner scan = new Scanner(System.in);
		
		void printPen(){
			System.out.print("Enter the colour of the pen> ");
			String colour = scan.next();
			System.out.print("Enter the size of the pen(in mm)> ");
			double size = scan.nextDouble();
			System.out.print("Enter the type of the pen> ");
			String type = scan.next() + scan.nextLine();
			System.out.println("Colour: \t" + colour);
			System.out.printf("Size: \t\t%.1fmm%n", size);
			System.out.println("Type: \t\t" + type);
		}

		void totalWeight() {
			System.out.print("\nEnter the weight of the pen(in kg)> ");
			double weight = scan.nextDouble();
			System.out.print("Enter the quantity of the pen> ");
			int quantity = scan.nextInt();
			double totalWeight = weight * quantity;
			System.out.printf("Total weight of the pens: %.2fkg%n", totalWeight);
		}
		
		void promotion() {
			System.out.println("\nPromotion! Buy 3 pens to get 1 free!");
			System.out.print("How many pens do you want to buy?> ");
			int quantity = scan.nextInt();
			if (quantity  >= 3) {
				System.out.println("Congratulations, you get a free pen!");
			}
			else {
				System.out.println("Buy more pens to get free pen!");
			}
		}
		
		void refill() {
			System.out.print("\nDoes the pen have a refill pack?(Y/N)> ");
			char refill = scan.next().toUpperCase().charAt(0);
			switch(refill) {
			case 'Y':
				System.out.println("This pen is refillable.");
				break;
			case 'N':
				System.out.println("This pen is not refillable.");
				break;
			}
		}
}
