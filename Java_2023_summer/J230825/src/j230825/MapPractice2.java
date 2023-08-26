package j230825;

import java.util.*;

enum KeyNum {
    EVEN, ODD
}


public class MapPractice2 {
    public static void main(String[] args) throws Exception {
        Integer[] nums = {1,5,90,4,6,8,7,2,9,11,23,65,33,10,3};

        Map<KeyNum, ArrayList> m = new HashMap<>();

        for (Integer num : nums) {

            KeyNum key = KeyNum.ODD;
            
            if (num % 2 == 0) {
                key = KeyNum.EVEN;
            }
            
            ArrayList<Integer> arr = m.get(key);

            if (arr == null) {
                arr = new ArrayList<>();
            }

           arr.add(num);
           m.put(key,arr);
            
        }

        System.out.println(m);

        ArrayList<Integer> kkk = m.get(KeyNum.EVEN); // Map 변수 m(★)의 key 중 EVEN(★)의 value인 ArrayList 형태의 List(★)를 kkk에 집어넣는다.
        ArrayList<Integer> vvv = m.get(KeyNum.ODD);

        kkk.sort(Comparator.reverseOrder()); // kkk변수(리스트)를 내림차순 정렬한다.
        vvv.sort(Comparator.reverseOrder());

        m.put(KeyNum.EVEN,kkk); // m의 EVEN(key값)에 내림차순 정렬한 kkk를 집어넣는다.
        m.put(KeyNum.ODD,vvv);

        
        System.out.println(m);
        
       
    }
}
