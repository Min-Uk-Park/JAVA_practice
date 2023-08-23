package j230824;

import java.util.*;

public class DequePractice {
    public static void main(String[] args) throws Exception {

        // Deque는 FIFO, LIFO 둘 다 가능!

        String s = "4 + 5 / 6";
        Deque<String> dq = new LinkedList<>();
        Deque<String> ori_s = new LinkedList<>();
            
        Scanner sc = new Scanner(s);

        while (sc.hasNext()) {
            String tok = sc.next();

            switch(tok) {
                case "0" :
                case "1" : 
                case "2" : 
                case "3" : 
                case "4" : 
                case "5" : 
                case "6" : 
                case "7" : 
                case "8" : 
                case "9" : dq.addFirst(tok); break;
                default : dq.addLast(tok); break;
            }

        }

        System.out.println(dq);

        
        while (!dq.isEmpty()) {

            if (dq.size() == 0) {break;}

            ori_s.addFirst(dq.removeFirst());

            if (dq.size() == 0) {break;}

            ori_s.addFirst(dq.removeLast());

        }

        System.out.println(ori_s);
    }
}
