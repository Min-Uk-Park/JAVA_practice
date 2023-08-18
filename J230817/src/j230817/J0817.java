package j230817;

import java.util.Scanner;

public class J0817 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Operate k = new Operate();

        

        String x = sc.next();
        String op = sc.next();
        String y = sc.next();

        int a = Integer.parseInt(x);
        int b = Integer.parseInt(y);


        // System.out.println(x);
        // System.out.println(op);
        // System.out.println(y);

        int result = k.caculate(a,b,op);

        System.out.println(result);

        

    }
}

class Operate {

    int result;

    int caculate (int a, int b, String op) {
        System.out.println(op);

        result = 1;

        switch(op) {
            case "^" : {
                for (int i = 1; i <= b; i++) {
                    result = result * a;
            }
                break;
            }
            default : break;
        }

        return result;
    }
}