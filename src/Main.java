import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        double op1;
        double op2;
        char operation;
        char calculator;
        double res;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите 1 операнд:");
            op1 = scanner.nextDouble();
            System.out.println("Введите оператор:");
            operation = scanner.next().charAt(0);
            System.out.println("Введите 2 операнд:");
            op2 = scanner.nextDouble();
            res = result(op1, op2, operation);
            System.out.println(op1 + " " + operation + " " + op2 + "=" + res);
            calculator = scanner.next().charAt(0);
        } while (calculator != 's');


    }

    public static double result(double op1, double op2, char operation) {
        return switch (operation) {
            case '+' -> op1 + op2;
            case '-' -> op1 - op2;
            case '*' -> op1 * op2;
            case '/' -> op1 / op2;
            default -> {
                System.out.println("Неверный знак!");
                yield 0;
            }

        };

    }
}