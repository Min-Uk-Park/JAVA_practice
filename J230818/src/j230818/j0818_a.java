package j230818;

import java.util.Scanner;
import java.util.ArrayList;

public class j0818_a {
    public static void main(String[] args) throws Exception {
        // ArrayList<E>
        Scanner sc = new Scanner(System.in);
        ArrayList<String> months = new ArrayList<String>();


        int month = sc.nextInt();

        switch (month) {
            case 1: months.add("Jan");
            case 2: months.add("Feb");
            case 3: months.add("March");
            case 4: months.add("April");
            case 5: months.add("May");
            case 6: months.add("May");
            case 7: months.add("June");
            case 8: months.add("July");
            case 9: months.add("Agust");
            case 10: months.add("September");
            case 11: months.add("November");
            case 12: months.add("December"); break;
            default: break;  
        }
       
        if (months.isEmpty()) {
            System.out.println("Invalid month num");
            return; // main함수는 void형이어서 return값 없다. => 따라서 프로그램 종료를 의미한다!
        }

        for (String mon : months) {
            System.out.println(mon);
        }
       
        System.out.println();

        months.forEach((monthName) -> {
            System.out.println(monthName);
        });
        

    }

}
