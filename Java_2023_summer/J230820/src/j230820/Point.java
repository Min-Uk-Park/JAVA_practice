package j230820;

import java.util.Scanner;

public class Point {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int[][] a = {
            {12,5,78,64,21},
            {11,41,77},
            {1,2,3,4,5,6,7,8}
            };

        int search = sc.nextInt();
        int col = 0;
        int row = 0;
        boolean found = false;
        
        // point:
        //     for(int i = 0; i < a.length; i++) {

        //         col = i;
        //         row = 0;
        //         for(int num : a[i]) {
                    
        //             if (num == search) {
        //                 found = true;
        //                 break point;
        //             }

        //             row++;
        //         }
        //     }



        // System.out.println("find number " + search + " is at " + col + "행, " + row + "열");

        point:
            for(col = 0; col < a.length; col++) {
                for(row = 0; row < a[col].length; row++) {
                    if (a[col][row] == search) {
                        found = true;
                        break point;
                    }
                }
            }

        if (found) {
            System.out.println("find number " + search + " is at " + col + "행, " + row + "열");
        }
        else {
            System.out.println("find number " + search + " is not in the array");
        }

    }
}
