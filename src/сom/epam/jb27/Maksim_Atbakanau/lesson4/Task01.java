package сom.epam.jb27.Maksim_Atbakanau.lesson4;

import java.util.Random;
import java.util.Scanner;

public class Task01 {
    //    В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К
    public static void main(String[] args) {
        System.out.println("Введеите делитель");
        int K = readConsole();
        int[] arr = createArray();
        enterArrayWithRandom(arr);
        printArray(arr);
        int sum = sumElements(arr, K);
        formattedPrint(sum, K);
    }

    public static int readConsole() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        while (!sc.hasNextInt()) {
            System.out.print("Не верный формат! Введите число: ");
            sc.next();
        }
        return sc.nextInt();
    }

    public static void printArray(int[] mas) {
        System.out.println("--------------------------------------------");
        for (int i = 0; i < mas.length; i++) {
            System.out.print("mas[" + i + "]=" + mas[i] + "; ");
        }
        System.out.println();
        System.out.println("--------------------------------------------");
    }

    public static void enterArrayWithRandom(int[] mas) {
        Random rand = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = rand.nextInt(300);
        }
    }

    public static int[] createArray() {
        System.out.println("Введите размер массива");
        int N = readConsole();
        return new int[N];
    }

    public static int sumElements(int[] arr, int K) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % K == 0) {
                sum = sum + arr[i];
            }
        }
        return sum;
    }

    public static void formattedPrint(int sum, int K) {
        System.out.println("Сумма элементов массива, кратных " + K + ", равна " + sum);
    }
}
