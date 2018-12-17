package сom.epam.jb27.Maksim_Atbakanau.lesson4;

import java.util.Random;
import java.util.Scanner;

public class Task03 {
    //    В целочисленной последовательности есть нулевые элементы. Создать массив из номеров этих элементов.
    public static void main(String[] args) {
        int[] arr = createArray();
        enterArrayWithRandom(arr);
        printArray(arr);
        int[] result = zeroIndexes(arr);
        printArray(result);
    }

    public static void enterArrayWithRandom(int[] mas) {
        Random rand = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = rand.nextInt(2);
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

    public static void printArray(int[] mas) {
        System.out.println("--------------------------------------------");
        for (int i = 0; i < mas.length; i++) {
            System.out.print("mas[" + i + "]=" + mas[i] + "; ");
        }
        System.out.println();
        System.out.println("--------------------------------------------");
    }

    public static int[] zeroIndexes(int[] arr) {
        int count = 0;
        int lastZero = 0;
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
                lastZero = i;
            }
        }
        int[] result = new int[count];
        for (int i = 0; i <= lastZero; i++) {
            if (arr[i] == 0) {
                result[j] = i;
                j++;
            }
        }
        return result;
    }

}
