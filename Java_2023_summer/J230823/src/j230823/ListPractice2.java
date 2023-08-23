package j230823;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListPractice2 {
    public static void main(String[] args) throws Exception {

        ArrayList<String> hum = new ArrayList<>();
        ArrayList<String> com = new ArrayList<>();
            
        char alpha = 'a';

        while(true) {
            hum.add(Character.toString(alpha));
            com.add(Character.toString(alpha));

            if (alpha == 'z') {
                break;
            }

            alpha++;
        }

        Collections.shuffle(hum);
        Collections.shuffle(com);

        Scanner sc = new Scanner(System.in);

        System.out.print("글자(a~z)를 입력하세요 : " );
        String find = sc.next();

        System.out.println("Hum" + hum);
        System.out.println("Com" + com);

        int hum_index = hum.indexOf(find);
        int com_index = com.indexOf(find);

        if (hum_index > com_index) {
            System.out.println("Hum Win!");
            return;
        }
        else if (hum_index < com_index) {
            System.out.println("Com Win!");
            return;
        }

        System.out.println("Draw");



    }
}
