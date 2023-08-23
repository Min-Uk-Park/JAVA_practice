package j230820;

import java.util.Scanner;

public class FindChar {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        String sentence = "this is the most sensitive sentence since I've experienced ever";

        char find = sc.next().charAt(0);

        int count = 0;

        // for(int i = 0; i < sentence.length(); i++){
        //     if (sentence.charAt(i) != find) {
        //         continue;
        //     }

        //     count++;
        // }
        
        int j = 0;
        do {
            j = sentence.indexOf(find, j);

            if (j == -1) {
                break;
            }

            count++;
            j++;
        } while(j < sentence.length());
        

        System.out.println("sentence에서 " + find + "의 개수는 " + count + "개입니다.");
        

    }
}
