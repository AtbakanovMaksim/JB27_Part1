package сom.epam.jb27.maksim_atbakanau.lesson4;

import java.util.Random;
import java.util.Scanner;

public class Task02 {
    //    Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить, будет ли она возрастающей
    public static void main(String[] args) {
        int[] arr = createArray();
        enterArrayWithRandom(arr);
        printArray(arr);
        isRaise(arr);
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

    public static int readConsole() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        while (!sc.hasNextInt()) {
            System.out.print("Не верный формат! Введите число: ");
            sc.next();
        }
        return sc.nextInt();
    }

    public static void isRaise(int[] arr) {
        boolean isRaise = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isRaise = false;
                System.out.println("Не возрастающая");
                break;
            }
        }
        if (isRaise) {
            System.out.println("Возрастающая");
        }
    }

    public static void printArray(int[] mas) {
        System.out.println("--------------------------------------------");
        for (int i = 0; i < mas.length; i++) {
            System.out.print("mas[" + i + "]=" + mas[i] + "; ");
        }
        System.out.println();
        System.out.println("--------------------------------------------");
    }
}
