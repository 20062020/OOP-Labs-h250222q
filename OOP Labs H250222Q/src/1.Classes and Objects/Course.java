public class Course {
    String title;
    StudentLab1 topStudent;

    public static void main(String[] args) {
        StudentLab1 s = new StudentLab1();
        s.name = "Ruvarashe";
        s.gpa = 3.9;

        Course c = new Course();
        c.title = "Object-Oriented Programming";
        c.topStudent = s;

        System.out.println(c.title + " top student: " + c.topStudent.name);
    }
}
