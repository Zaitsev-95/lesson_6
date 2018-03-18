import java.util.Scanner;
import java.util.InputMismatchException;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Введдите 1, если хотите работать  с оним числом\nВведдите 2, если хотите работать  с двумя числами");
        Scanner scanner = new Scanner(System.in);
        int intScanner = 0;
        try {
            intScanner = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели не верное значение!");
            System.exit(1);
        }
        if (intScanner == 1) {
            System.out.println("Введите число");
            int number = 0;
            try {
                number = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Вы ввели не верное значение!");
                System.exit(1);
            }
            WorkOnOneNumber workOnOneNumber = new WorkOnOneNumber(number);
            System.out.println("Введите 2, чтобы возвести в квадрат\nВведите 3, чтобы возвести в куб");
            scanner.nextLine();
            String mathActionOne = scanner.nextLine();
            switch (mathActionOne) {
                case "2":
                    workOnOneNumber.squaring();
                    break;
                case "3":
                    workOnOneNumber.erectingCube();
                    break;
                default:
                    System.out.println("Вы ввели не верное значение!");
                    break;
            }
        } else if (intScanner == 2) {
            System.out.println("Введите первое и второе число");
            double numberOne = 0;
            double numberTwo = 0;
            try {
                numberOne = scanner.nextDouble();
                numberTwo = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Вы ввели не верное значение!");
                System.exit(1);
            }
            WorkOnTwoNumbers workOnTwoNumbers = new WorkOnTwoNumbers(numberOne, numberTwo);
            System.out.println("Введите + , чтобы произвести сложение\nВведите - , чтобы произвести вычитание\nВведите * , чтобы произвести умножение\nВведите / , чтобы произвести деление\n");
            scanner.nextLine();
            String mathActionOne = scanner.nextLine();
            switch (mathActionOne) {
                case "+":
                    workOnTwoNumbers.addition();
                    break;
                case "-":
                    workOnTwoNumbers.subtraction();
                    break;
                case "*":
                    workOnTwoNumbers.multiplication();
                    break;
                case "/":
                    if (numberOne != 0) {
                        workOnTwoNumbers.division();
                    } else {
                        System.out.println("Делить на ноль нельзя!");
                        break;
                    }
                default:
                    System.out.println("Вы ввели не верное значение!");
                    break;
            }
        } else {
            System.out.println("Вы ввели не верное значение!");
        }
    }
}