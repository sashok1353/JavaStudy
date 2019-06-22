package homework.task1;

public class Homework1 {

    public static void main(String[] args) {
        int a = 1;
        int b = -8;
        int c = 12;
        int d= b * b - 4 * a * c;
        double d1 = Math.sqrt(d);
        double x1 = (-b - d1) / (2*a);
        double x2 = (-b + d1) / (2*a);

        String result = "x1 = " + x1 + "; x2 = " + x2;

        System.out.println(result);
    }
}
