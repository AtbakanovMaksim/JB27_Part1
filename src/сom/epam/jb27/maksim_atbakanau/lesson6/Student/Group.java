package сom.epam.jb27.maksim_atbakanau.lesson6.Student;

import java.util.ArrayList;
import java.util.List;

public class Group {
    String name;
    List<Student> studentsList = new ArrayList<Student>();
    private double groupAverageMark;

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
            if (studentsList.get(i).getAverageMark() == 5.0) {
                result = result + studentsList.get(i).getName() + "\n";
            }
        }
        return result;
    }

    public String findBad() {
        String result = "Bad students:\n";
        for (int i = 0; i < studentsList.size(); i++) {
            if (studentsList.get(i).getMark1() == 2 || studentsList.get(i).getMark2() == 2 ||
                    studentsList.get(i).getMark3() == 2) {
                result = result + studentsList.get(i).getName() + "\n";
            }
        }
        return result;
    }
}
