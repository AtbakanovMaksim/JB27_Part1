package сom.epam.jb27.Maksim_Atbakanau.lesson1;

//Напишите программу нахождения гипотенузы и площади прямоугольного треугольника по двум катетам.
public class Task02 {
    public static void main(String[] args) {
        double a = 3;
        double b = 4;
        double c;
        double square;

        c = Math.sqrt(a * a + b * b);
        square = 0.5 * a * b;
        System.out.println("Катет a=" + a + ", катет b=" + b + ".\nГипотенуза с=" + c + ", площадь равна " + square);
    }
}
