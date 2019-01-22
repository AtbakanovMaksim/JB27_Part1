package сom.epam.jb27.maksim_atbakanau.lesson6.Student;

public class Student {
    private String name;
    private int mark1;
    private int mark2;
    private int mark3;
    private double averageMark;
    private final int NUMBER_OF_MARKS = 3;

    public Student(String name, int mark1, int mark2, int mark3) {
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.averageMark = (mark1 + mark2 + mark3) / NUMBER_OF_MARKS;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark1() {
        return mark1;
    }

    public void setMark1(int mark1) {
        this.mark1 = mark1;
    }

    public int getMark2() {
        return mark2;
    }

    public void setMark2(int mark2) {
        this.mark2 = mark2;
    }

    public int getMark3() {
        return mark3;
    }

    public void setMark3(int mark3) {
        this.mark3 = mark3;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (mark1 != student.mark1) return false;
        if (mark2 != student.mark2) return false;
        if (mark3 != student.mark3) return false;
        return Double.compare(student.averageMark, averageMark) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = mark1;
        result = 31 * result + mark2;
        result = 31 * result + mark3;
        temp = Double.doubleToLongBits(averageMark);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Student " + name + ":" +
                "\t mark1=" + mark1 +
                "\t mark2=" + mark2 +
                "\t mark3=" + mark3 +
                "\t averageMark=" + averageMark;

    }
}
