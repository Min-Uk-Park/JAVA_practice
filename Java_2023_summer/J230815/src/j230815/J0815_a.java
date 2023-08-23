package j230815;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class J0815_a {
    public static void main(String[] args) throws Exception {

        int[] num_arr = {1,2,8,10,0,5,4,9,7};

        Arrays.sort(num_arr);

        // System.out.println(num_arr); // 첫 번째(첫 인덱스) 배열의 주소가 출력됨.

        System.out.println(Arrays.toString(num_arr));

        Integer[] arr = {10,25,88,33,41,72,0,11};

        // ascending
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        // descending
        Arrays.sort(arr,Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));

        String[] string_arr = {"z15","z11","a2","b3","a5","b0"};

        // ascending
        Arrays.sort(string_arr);
        System.out.println(Arrays.toString(string_arr));

        // descending
        Arrays.sort(string_arr,Collections.reverseOrder());
        System.out.println(Arrays.toString(string_arr));

    }
}
