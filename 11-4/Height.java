import java.util.Scanner;


public class Height {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String sex = sc.next();
            double height = sc.nextDouble();
            if (sex.equals("M")) {
                System.out.println(String.format("%.2f", height / 1.09));
            } else {
                System.out.println(String.format("%.2f", height * 1.09));
            }
        }
    }
}