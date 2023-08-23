package j0809;

import java.util.Scanner;

public class J0809 {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        System.out.print("숫자를 입력하세요. ");

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        System.out.println("입력한 숫자는 " + a + "입니다. ");

        sc.close();
    }
}
