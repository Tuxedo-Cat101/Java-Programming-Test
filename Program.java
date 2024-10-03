import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        double num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();
        System.out.println("Enter the second number: ");
        num2 = scanner.nextDouble();
        scanner.close();
        Calc calc = new Calc(num1, num2);
        double addition = calc.addition();
        double subtraction = calc.subtraction();
        System.out.println("\nAddition Result: " + addition + "\nSubtraction Result: " + subtraction);
    }
}
