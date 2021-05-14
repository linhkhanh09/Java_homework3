package fs.apidef.identifyservice.java.java_homework3;

import java.util.Scanner;

public class Fibonacci_Solution1 {
    public static void main(String[] args) {
        int n, num1 = 0, num2 = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào n số fibonacci đầu tiên:");
        n = scanner.nextInt();
        System.out.print("Chuỗi Fibonacci với "+n+" số là: ");
        for (int i = 1; i <= n; ++i)
        {
            System.out.print( +num1+" ");
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
        }
    }
}
