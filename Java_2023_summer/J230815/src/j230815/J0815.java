package j230815;

import java.util.Arrays;
// import java.util.Scanner;

public class J0815 {
    public static void main(String[] args) throws Exception {
        
        // 배열 선언 방법 1. 
        int[] num_array1;

        num_array1 = new int[5];

        num_array1[0] = 1;
        num_array1[1] = 2;
        num_array1[2] = 3;
        num_array1[3] = 4;
        num_array1[4] = 5;

        // 배열 선언 방법 2. 선언과 동시에 초기화한다!
        int[] num_array2 = {10,20,30,40,50};

        for(int i=0;i<5;i++){
            System.out.print(num_array1[i] + " ");
        }
 
        System.out.println();

        for(int i=0;i<5;i++){
            System.out.print(num_array2[i] + " ");
        }

        System.out.println();

        // 문자열 배열 선언 - 2차원 배열
        String[][] names = {{"park","kim","hong"},
                        {"minuk","donghyun","chul"}};

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
            System.out.println(names[0][i] + names[1][j]);
        }

        
        // System.out.print(names[0][n] + names[1][n]);

        
        // 배열을 문자열로 변환해보기
        char[] title = {'R','o','b','e','r','t','o','p','p','e','n','h','e','i','m','e','r'};
        char[] copytitle_1 = new char[11];
        char[] copytitle_2 = Arrays.copyOfRange(title, 6, 17);
        System.arraycopy(title, 6, copytitle_1, 0, 11);


        System.out.println(new String(copytitle_1));
        System.out.println(new String(copytitle_2));
                
        int[] score = {20,25,31,25};
        int[] copy_score = new int[2];

        System.arraycopy(score, 2, copy_score, 0, 2);
        System.out.println(copy_score); // 시작 번지가 나온다!!
        System.out.println(Arrays.toString(copy_score)); // "[31, 25]" 배열 형태 전체가 문자열 형태로 출력되는 것이다.!!
    }
}
