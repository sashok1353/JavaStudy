package homework.task2;
        import java.util.Arrays;

public class Homework2 {
    public static void main(String[] args) {
        int [ ] mas = {6, 82, 78, 96, 10};

        boolean flag = false;
        int a;
        while(!flag) {
            flag = true;
            for(int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]) {
                    flag = false;
                    a = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = a;
                }
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}
