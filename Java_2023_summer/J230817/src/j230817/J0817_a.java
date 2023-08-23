package j230817;

import java.util.Scanner;

public class J0817_a {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        
        opop kkk = new opop();
        
        int op_num;

        for(;;) {

            String op = sc.next();
            if (op == "+" || op == "-" || op == "*"  || op == "/"  || op == "^") {
                // System.out.println("555");
                op_num = kkk.opCheck(op);
                System.out.println(op_num);
            }

            else if ( op == "=") break;

            

        }

        sc.close();


    }
}


// 수를 입력하면 연산자에 맞게 계산해주는 계산기 만들기
// 연산자는 +, -, /, *, ^ 이다!

class Caculater {
    
    

    // double doCaculate() {
       
    // }
}

class opop {
    int op;
    int opCheck(String x) {
        switch(x) {
            case "^" : {
                op = 1;
                break;
            }
            case "*" : {
                op = 2;
                break;
            }
            case "/" : {
                op = 2;
                break;
            }
            case "+" : {
                op = 3;
                break;
            }
            case "-" : {
                op = 3;
                break;
            }
            default : {
                
                break;
            }
        }

        return op;

    }
}