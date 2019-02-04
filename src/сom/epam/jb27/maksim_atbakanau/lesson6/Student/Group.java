package сom.epam.jb27.maksim_atbakanau.lesson6.Student;

import java.util.ArrayList;
import java.util.List;

public class Group {
    String name;
    List<Student> studentsList = new ArrayList<Student>();
    private double groupAverageMark;
    private final double GOOD_AVERAGE_MARK = 5.0;
    private final int BAD_MARK = 2;

    public Group(String name) {
        this.name = name;
    }

    public void calculateGroupAverageMark() {
        double sum = 0;
        int num = studentsList.size();
        for (int i = 0; i < studentsList.size(); i++) {
            sum = sum + studentsList.get(i).getAverageMark();
        }
        this.groupAverageMark = sum / num;
    }

    @Override
    public String toString() {
        String result = "Group " + name + "\n" +
                "groupAverageMark = " + groupAverageMark + "\n";
        for (int i = 0; i < studentsList.size(); i++) {
            result = result + studentsList.get(i).toString() + "\n";
        }
        return result;
    }

    public String findGood() {
        String result = "Good students:\n";
        for (int i = 0; i < studentsList.size(); i++) {
            if (studentsList.get(i).getAverageMark() == GOOD_AVERAGE_MARK) {
                result = result + studentsList.get(i).getName() + "\n";
            }
        }
        return result;
    }

    public String findBad() {
        String result = "Bad students:\n";
        for (int i = 0; i < studentsList.size(); i++) {
            if (studentsList.get(i).getMark1() == BAD_MARK || studentsList.get(i).getMark2() == BAD_MARK ||
                    studentsList.get(i).getMark3() == BAD_MARK) {
                result = result + studentsList.get(i).getName() + "\n";
            }
        }
        return result;
    }
}
