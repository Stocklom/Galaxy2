import java.util.Arrays;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner stop = new Scanner(System.in);
        do {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Число 1 = ");
                if (scanner.hasNextInt()) {
                    int operand1 = scanner.nextInt();//считывает число 1
                        System.out.println("Арифметическое дейстиве: сложение, вычетание, деление или умножение? ");
                    char operation = scanner.next().charAt(0);//считываем строку
                        System.out.print("Число 2 = ");
                    if (scanner.hasNextDouble()) {
                        double operand2 = scanner.nextDouble();//считывает число 2
                        if (operation == 'с') {
                            double result = operand1 + operand2;
                                System.out.println(result);
                        } else if (operation == 'в') {
                            System.out.println(operand1 - operand2);
                        } else if (operation == 'д') {
                            System.out.println(operand1 / operand2);
                        } else if (operation == 'у') {
                            System.out.println(operand1 * operand2);
                        } else {
                            System.out.println("Не известное арифмитическое действие");
                        }
                    } else if (scanner.hasNextInt()) {
                        int operand2 = scanner.nextInt();//считывает число
                        if (operation == 'с') {
                            System.out.println(operand1 + operand2);
                        } else if (operation == 'в') {
                            System.out.println(operand1 - operand2);
                        } else if (operation == 'д') {
                            System.out.println(operand1 / operand2);
                        } else if (operation == 'у') {
                            System.out.println(operand1 * operand2);
                        } else {
                            System.out.println("Не известное арифмитическое действие");
                        }
                    }
                } else if (scanner.hasNextDouble()) {
                    double operand1 = scanner.nextDouble();//считывает число 1
                        System.out.println("Арифметическое дейстиве: сложение, вычетание, деление или умножение? ");
                    char operation = scanner.next().charAt(0);//считываем строку
                        System.out.print("Число 2 = ");
                    if (scanner.hasNextDouble()) {
                        double operand2 = scanner.nextDouble();//считывает число 2
                        if (operation == 'с') {
                            System.out.println(operand1 + operand2);
                        } else if (operation == 'в') {
                            System.out.println(operand1 - operand2);
                        } else if (operation == 'д') {
                            System.out.println(operand1 / operand2);
                        } else if (operation == 'у') {
                            System.out.println(operand1 * operand2);
                        } else {
                            System.out.println("Не известное арифмитическое действие");
                        }
                    } else if (scanner.hasNextInt()) {
                        int operand2 = scanner.nextInt();//считывает число
                        if (operation == 'с') {
                            System.out.println(operand1 + operand2);
                        } else if (operation == 'в') {
                            System.out.println(operand1 - operand2);
                        } else if (operation == 'д') {
                            System.out.println(operand1 / operand2);
                        } else if (operation == 'у') {
                            System.out.println(operand1 * operand2);
                        } else {
                            System.out.println("Не известное арифмитическое действие");
                        }
                    }
                }
        } while (stop.nextLine() == "s");
    }
}