import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double celsius = 0;
        String trash;
        boolean correct = false;


        //Loop
        do {
            System.out.println("Enter Temperature in Celsius. ");

            if (in.hasNextDouble()) {
                celsius = in.nextDouble();
                in.nextLine();
                correct = true;
            }else {
                trash = in.nextLine();
                System.out.println("Invalid Input you've entered: " + trash);
            }
        }while (!correct);

        double fahrenheit = (celsius * (9.0 / 5.0) + 32);
        //Output
        System.out.println("The temperature in Fahrenheit is: " + fahrenheit);



    }
}
