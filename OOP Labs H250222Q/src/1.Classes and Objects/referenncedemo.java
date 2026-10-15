public class referenncedemo {
    public class ReferenceDemo {
        public static void main(String[] args) {
            StudentLab1 a = new StudentLab1();
            a.name = "Original";

            StudentLab1 b = a;
            b.name = "Changed via b";
            System.out.println(a.name);

            StudentLab1 c = new StudentLab1();
            c.name = "Changed via b";

            System.out.println(a == b);
            System.out.println(a == c);

            StudentLab1 d = null;
            if (d == null) {
                System.out.println("d does not refer to any object");
            }
        }
    }
}
