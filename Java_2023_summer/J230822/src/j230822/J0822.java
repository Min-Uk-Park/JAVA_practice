package j230822;

import java.util.*;


public class J0822 {
    public static void main(String[] args) throws Exception {
        Set<String> s_set = new HashSet<String>();
        Set<String> s_set2 = new HashSet<String>();

        s_set2.add("i"); // s_set2 의 요소는 i만 있다!


        String[] sentence = new String[] {"i","came", "i", "saw", "i", "left"};
        // String[] sentence = {~~}; 와 같은 문장임

        for (String e : sentence) {
            s_set.add(e);
        }

        System.out.println("Set type : " + s_set); // s_set는 Set type으로 요소가 중복이 안 된다!
 
        List<String> s_list = new ArrayList<>();

        s_list = Arrays.asList(sentence); // s_list는 List type으로 요소가 중복될 수 있다!

        System.out.println("List type : " + s_list); 


        // // for문 사용할 때 .forEach는 List type의 객체에서 사용 가능하다!
        // s_list.forEach((e) -> {
        //     System.out.print(e + " ");
        // });
        

        System.out.println();

        // .removeAll()과 .clear()의 차이점!
        boolean result = s_set.removeAll(s_set2); // s_set에 있는 "i"만 삭제된다!
        System.out.print(".removeAll() 사용 output : " + result + "  ");
        System.out.println(s_set);

        s_set.clear(); // s_set에 있는 모든 요소가 삭제된다!
        System.out.println(".clear() 사용 output : " + s_set); 
        System.out.println();

    }
}
