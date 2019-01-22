package сom.epam.jb27.maksim_atbakanau.lesson3.Task01;

import java.util.Scanner;

public class L3_5 {
    //    Ввести n строк с консоли, найти самую длинную и самую короткую строки. Вывести найденные строки и их длины.
    public static void main(String[] args) {

        int n = 10;
        String max = "", min = "", str = "";
        for (int i = 0; i < n; i++) {
            str = readConsole();
            if (i == 0) {
                min = str;
            }
            max = findMaxLength(str, max);
            min = findMinLength(str, min);
        }
        formattedPrint(min);
        formattedPrint(max);
    }

    public static String readConsole() {
        Scanner sc = new Scanner(System.in);
        String str = "";
        System.out.print("> ");
        if (sc.hasNextLine()) {
            str = sc.nextLine();
        }
        return str;
    }

    public static String findMinLength(String str, String min) {
        if (str.length() < min.length()) {
            min = str;
        }
        return min;
    }

    public static String findMaxLength(String str, String max) {
        if (str.length() > max.length()) {
            max = str;
        }
        return max;
    }

    public static void formattedPrint(String result) {
        System.out.println("Result string = " + result + ", length=" + result.length());
    }
}
