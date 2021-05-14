package fs.apidef.identifyservice.java.java_homework3;

import java.util.Scanner;

public class TinhGiaiThua_Solution1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n = ");
        int n = scanner.nextInt();
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Giai thừa của " + n + " là: " + fact);
    }
}
