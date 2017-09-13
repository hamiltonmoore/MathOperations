import java.util.Scanner;

public class MathOperations2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a number");
        String x = scanner.nextLine();
        Double a = Double.parseDouble(x);

        System.out.println("enter another number");
        String y = scanner.nextLine();
        Double b = Double.parseDouble(y);

        double sum = a + b;
        double difference = a - b;
        double division = a / b;
        double multiplication = a*b;
        double remainder = a%b;

        System.out.println("the sum is" + sum);
        System.out.println("the difference is " + difference);
        System.out.println("When divided the qoutient is: " + division);
        System.out.println("When numbers are multiplied:" + multiplication);
        System.out.println("the remainder is: " + remainder);
    }
