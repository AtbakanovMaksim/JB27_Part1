package сom.epam.jb27.maksim_atbakanau.lesson6.Fraction;

import java.util.Scanner;

public class FractionMain {
    public static void main(String[] args) {
        Fraction[] fractionArray = createArray();
        enterArray(fractionArray);
        printArray(fractionArray);
    }

    private static int readConsole() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        while (!sc.hasNextInt()) {
            System.out.print("Не верный формат! Введите число: ");
            sc.next();
        }
        return sc.nextInt();
    }

    private static Fraction[] createArray() {
        System.out.println("Введите размер массива");
        int n = readConsole();
        return new Fraction[n];
    }

    private static void printArray(Fraction[] mas) {
        System.out.println("--------------------------------------------");
        for (int i = 0; i < mas.length; i++) {
            System.out.println("mas[" + i + "] = " + mas[i].toString() + "; ");
        }
        System.out.println();
        System.out.println("--------------------------------------------");
    }

    private static void enterArray(Fraction[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.println("Введите числитель:");
            int dividend = readConsole();
            int divider = 0;
            while (divider==0){
                System.out.println("Введите знаменатель (не может быть равен 0)");
                divider = readConsole();
            }
            mas[i] = new Fraction(dividend, divider);
        }
    }
}
