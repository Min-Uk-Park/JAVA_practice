package caculator0823;

import java.util.*;

public class Caculator_0823 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); 
        MulDiv md = new MulDiv();
        PluseMinuse pm = new PluseMinuse();

        String s = sc.next();

        List<String> arr = new ArrayList<>();

        while (true) {
            if (s.compareTo("=") == 0) break;

            arr.add(s);

            s = sc.next();
        }

        while (true) {
            int num = 0;

            if (arr.indexOf("*") != -1) {
                num = arr.indexOf("*");
                arr = md.caculate(arr, num); 
            }
            else if (arr.indexOf("/") != -1) {
                num = arr.indexOf("/");
                arr = md.caculate(arr, num);
            }
            
            else {
                break;
            }
        }
        
        System.out.println(arr);
        
        while (true) {
            int num = 0;

            if (arr.indexOf("+") != -1) {
                num = arr.indexOf("+");
                arr = pm.caculate1(arr, num); 
            }
            else if (arr.indexOf("-") != -1) {
                num = arr.indexOf("-");
                arr = pm.caculate1(arr, num);
            }
            else {
                break;
            }
        }

        System.out.println(arr);


        sc.close();

        
        
    }

}


class MulDiv {
    List<String> caculate(List<String> arr, int a) {

        switch (arr.get(a)) {
                case "*" : 
                    double k = Double.parseDouble(arr.get(a-1)) * Double.parseDouble(arr.get(a+1));
                    arr.set(a-1, Double.toString(k));
                    arr.set(a, "@");
                    arr.set(a+1, "@");
                    break;
                case "/" :
                    double l = Double.parseDouble(arr.get(a-1)) / Double.parseDouble(arr.get(a+1));
                    arr.set(a-1, Double.toString(l));
                    arr.set(a, "@");
                    arr.set(a+1, "@");
                    break;
            }

        while (true) {
            if (arr.indexOf("@") == -1) break;

            arr.remove(arr.indexOf("@"));
        }

        return arr;
    }
}

class PluseMinuse {

    List<String> caculate1(List<String> arr, int a) {

    
        switch (arr.get(a)) {
            case "+" : 
                double k = Double.parseDouble(arr.get(a-1)) + Double.parseDouble(arr.get(a+1));
                arr.set(a-1, Double.toString(k));
                arr.set(a, "0000000");
                arr.set(a+1, "0000000");
            case "-" : 
                double j = Double.parseDouble(arr.get(a-1)) - Double.parseDouble(arr.get(a+1));
                arr.set(a-1, Double.toString(j));
                arr.set(a, "0000000");
                arr.set(a+1, "0000000");
        
        }
        while (true) {
            if (arr.indexOf("0000000") == -1) break;

            arr.remove(arr.indexOf("0000000"));
        }
        // System.out.println(arr);
        return arr;
    }
}