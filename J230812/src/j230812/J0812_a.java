package j230812;

import java.lang.*;

public class J0812_a {

    // Wrapper Classes(package : java.lang) => Types's Class들(Byte,Short,Integer,Character 등)을 묶어서 Wrapper Classes라고 한다. 실제 존재하는 클래스명은 아니다!
    public static void main(String[] args) throws Exception {

        // System.out.println("byte는 몇 byte? " + Byte.BYTES + "byte");
        // System.out.println("int는 몇 byte? " + Integer.BYTES + "bytes");
        
        // System.out.println();

        // System.out.println("byte는 몇 bit? " + Byte.SIZE + "bits");
        // System.out.println("int는 몇 bit? " + Integer.SIZE + "bits");

        // System.out.println("double은 몇 bit? " + Double.SIZE + "bits");

        
        // output : NaN, MAX_VALUE인데 이것은 문자열이 아니라 이름 붙은 상수이다!!!!!!
        double a = Double.NaN;
        // System.out.println(a);

        // double b = Double.MAX_VALUE;
        // System.out.println(b);
        
        String s = "TruE";

        // System.out.println(Boolean.parseBoolean(s));
        // System.out.println(s.length());

        int num = 260;

        Integer co = new Integer(num);
        
        System.out.println(co.SIZE);
        
    }
}
