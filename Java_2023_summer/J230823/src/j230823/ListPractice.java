package j230823;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;;

public class ListPractice {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String[] spaces= {"hearts", "clubs", "diamonds", "spades"};
        String[] nums = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "J", "Q", "K", "A"};

        List<String> deck = new ArrayList<>();

        for (int i = 0; i < spaces.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                deck.add(nums[j]+" of "+spaces[i]);
            }
        }

        // deck 확인 
        // deck.forEach((e) -> {
        //     System.out.print(e + ", ");
        //     if ((deck.indexOf(e) + 1) % 7 == 0) {
        //         System.out.println();
        //     }
        // });

        // List에서 shuffle 가능! Set은 요소가 중복 불가이며 순서가 없으므로 shuffle 메소드가 없다!
        Collections.shuffle(deck);

        
        // 섞은 deck 확인 
        deck.forEach((e) -> {
            System.out.print("[" + e + "]" + ", ");
            if ((deck.indexOf(e) + 1) % 7 == 0) {
                System.out.println();
            }
        });

        System.out.println();
        
        int spaces_num = sc.nextInt();
        int nums_num = sc.nextInt();
        int idx = spaces_num * nums_num - 1;

        if (idx > deck.size()) {
            System.out.println("Not enough cards");
            return;
        }

        System.out.println("card : " + deck.get(idx));
    }
}