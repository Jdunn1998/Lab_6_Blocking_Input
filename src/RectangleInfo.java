import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double width = 0;
        double height = 0;
        String trash;
        boolean correct;

        //loop
        do {
            correct = false;
            System.out.println("Enter the Height of the Rectangle ");
            if (in.hasNextDouble()) {
                height = in.nextDouble();
                if (height > 0) {
                    correct = true;
                } else {
                    System.out.println("You must enter a positive number not: " + height);
                }
            }else {
                    trash = in.nextLine();
                    System.out.println("Invalid input please try again: " +trash);
                }
            }while (!correct);
        do {
            correct = false;
            System.out.println("Enter the Width of the Rectangle ");
            if (in.hasNextDouble()) {
                width = in.nextDouble();
            if (width >0) {
                correct = true;
            }else {
                System.out.println("You must enter a Positive number not: " + width);
            }}else {
            trash = in.nextLine();
            System.out.println("Invalid input please try again: " + trash);
        }
        }while (!correct);
        //Calculations
        double area = height * width;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt((width * width) + (height * height));

        //Results
        System.out.printf("The area of the rectangle is: %.2f%n", area);
        System.out.printf("The perimeter of the rectangle is: %.2f%n ", perimeter);
        System.out.printf("The diagonal of the rectangle is: %.2f%n", diagonal);


}}
