package j230822;

import java.util.*;

public class SetPractice {
    public static void main(String[] args) throws Exception {

        Set<String> unique = new HashSet<>();
        Set<String> dupli = new HashSet<>();
        
        String[] s = {"i", "came", "i", "eat", "i", "ride"};

        // for (String e : s) {
        //     if (!unique.add(e)) {
        //         dupli.add(e);
        //     }
        // }

        for (String e : s) {
            if (unique.contains(e)) {
                dupli.add(e);
            }
            unique.add(e);
        }

        unique.removeAll(dupli);

        System.out.println(unique);
        System.out.println(dupli);
    }
}
