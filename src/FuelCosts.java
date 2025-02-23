import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gasTank = 0;
        double fuelEfficiency = 0;
        double gasPrice = 0;
        String trash;
        boolean correct;

        //Do while
        do {
            correct = false;
            System.out.println("Enter the amount of gallons in your tank. ");
            if (in.hasNextDouble()) {
                gasTank = in.nextDouble();
                in.nextLine();
                if (gasTank > 0) {
                    correct = true;
                }else {
                    trash = in.nextLine();
                    System.out.println("Invalid input! Input must be postive!: " + trash);
                }
            }

        }
        while (!correct);
        do {
            correct = false;
            System.out.println("Enter the fuel efficiency in MPG. ");
            if (in.hasNextDouble()) {
                fuelEfficiency = in.nextDouble();
                in.nextLine();
                if (fuelEfficiency > 0) {
                    correct = true;
                }else {
                    trash = in.nextLine();
                    System.out.println("Invalid input! Input must be postive!: " + trash);
                }
            }

        }while (!correct);
        do {
            correct = false;
            System.out.println("Enter the price of gas per gallon. ");
            if (in.hasNextDouble()) {
                gasPrice = in.nextDouble();
                in.nextLine();
                if (gasPrice > 0) {
                    correct = true;
                }else {
                    trash = in.nextLine();
                    System.out.println("Invalid input! Input must be postive!: " + trash);
                }
            }
        }while (!correct);

        //Calculations
        double cost100miles = ((100 / fuelEfficiency) * gasPrice);
        double maxDistance = (fuelEfficiency * gasTank);

        //Print
        System.out.println("The cost to drive 100 miles is: $" + cost100miles);
        System.out.println("The toatal distance you can drive is: " + maxDistance);

    }

}
