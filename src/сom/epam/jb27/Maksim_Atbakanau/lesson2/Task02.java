package сom.epam.jb27.maksim_atbakanau.lesson2;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
//      Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.
        double R;
        double square;
        double lenght;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Введите положительный R: ");
            while (!sc.hasNextDouble()) {
                System.out.print("Не верный формат! Введите число R: ");
                sc.next();
            }
            R = sc.nextInt();
        } while (R <= 0);

        square = Math.PI * R * R;
        lenght = 2 * Math.PI * R;
        System.out.println("Длина окружности радиусом " + R + " равна:" + lenght);
        System.out.println("Площадь круга радиусом " + R + " равна:" + square);
    }
}
