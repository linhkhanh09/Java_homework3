package fs.apidef.identifyservice.java.java_homework3;

import java.util.Scanner;

public class Fibonacci100 {
    public static void main(String args[]) {
        System.out.printf("Các số fibonacci nhỏ hơn 100 là: ");
        int i = 0;
        while (fibonacci(i) < 100) {
            int fi = fibonacci(i);
            System.out.println(fi + "");
            i++;
        }
    }

    public static int fibonacci(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}