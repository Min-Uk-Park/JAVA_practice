package j230825;

import java.util.*;

public class MapPractice {
    public static void main(String[] args) throws Exception {
        String s = "if it is to be it is up to me to delegate";

        String[] words = s.split(" ");
        
        Map<String, Integer> m = new HashMap<>();


        int k = 0;
        for (String word : words) {

            // if (m.get(word) == null) {
            //     k = 1;
                
            // }
            // else {
            //     k++;
            // }

            // 위의 코드와 같다!
            k = m.get(word) == null ? 1 : ++k;

            m.put(word, k);

        }

        System.out.println(m); // map 확인

        List<String> s_list = new ArrayList<>();

        for (String e : m.keySet()) {
            s_list.add(e);
        }

        System.out.println(s_list); // list 확인

        s_list.sort(Comparator.naturalOrder());

        System.out.println(s_list); // list 정렬!
        System.out.println();
        for (String e : s_list) {
            System.out.println(e + " → " + m.get(e));
        }


    }
}
