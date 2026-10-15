import java.util.*;

class StudentModel implements Comparable<StudentModel> {
    private final String name;
    private final double gpa;

    StudentModel(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    String getName() {
        return name;
    }

    double getGpa() {
        return gpa;
    }

    @Override
    public int compareTo(StudentModel o) {
        return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return name + "(" + gpa + ")";
    }
}

public class SortingDemo {
    public static void main(String[] args) {
        List<StudentModel> list = new ArrayList<>(List.of(
                new StudentModel("Kuda", 3.2),
                new StudentModel("Ada", 3.9),
                new StudentModel("Lynn", 3.5)));

        Collections.sort(list);
        System.out.println("By name: " + list);

        list.sort(Comparator.comparingDouble(StudentModel::getGpa).reversed());
        System.out.println("By GPA desc: " + list);

        list.sort(Comparator.comparing(StudentModel::getName).reversed());
        System.out.println("By name desc: " + list);
    }
}