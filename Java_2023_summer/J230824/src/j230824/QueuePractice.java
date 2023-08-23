package j230824;

import java.util.*;

public class QueuePractice {
    public static void main(String[] args) throws Exception {
        
        // queue는 FIFO(First In First Out)만!!

        Integer[] nums = {3, 4, 5, 10, 2, 4, 2, 3, 5, 11};

        Set<Integer> set_nums = new HashSet<>();
        Queue<Integer> que_nums = new LinkedList<>();

        // .addAll() ★
        set_nums.addAll(Arrays.asList(nums));

        System.out.println("Set : " + set_nums);

        que_nums.addAll(set_nums);

        System.out.println("Queue : " + que_nums);

        int n = 0;

        while (!que_nums.isEmpty()) {
            n = que_nums.remove();
            System.out.println(n + "Sec");
            Thread.sleep(n * 1000);
        }
        
    }
}
