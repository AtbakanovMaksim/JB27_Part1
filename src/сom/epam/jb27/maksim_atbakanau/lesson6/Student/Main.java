package сom.epam.jb27.maksim_atbakanau.lesson6.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Group myGroup = createGroup();
        System.out.println(myGroup.toString());

        System.out.println();
        System.out.println(myGroup.findGood());

        System.out.println();
        System.out.println(myGroup.findBad());
    }


    private static int readNumberFromConsole() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        while (!sc.hasNextInt()) {
            System.out.print("Не верный формат! Введите число: ");
            sc.next();
        }
        return sc.nextInt();
    }

    private static String readStringFromConsole() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите имя: ");
        return sc.nextLine();
    }

    private static void addToGroup(Group group) {
        System.out.println("Введите имя и оценки студента");
        group.studentsList.add(new Student(readStringFromConsole(), readNumberFromConsole(),
                readNumberFromConsole(), readNumberFromConsole()));
    }

    private static Group createGroup() {
        Group group = new Group(readStringFromConsole());
        System.out.println("Введите количество студентов");
        int size = readNumberFromConsole();
        for (int i = 0; i < size; i++) {
            addToGroup(group);
        }
        group.calculateGroupAverageMark();
        return group;
    }
}
