package j230812;

public class J0812 {
    public static void main(String[] args) throws Exception {

        // byte(1), short(2), int(4), long(8)
        byte a = 1;
        short b = 2;
        int c = 3;
        long d = 4L;

        // 2진수, 16진수
        int e = 0b011;
        int f = 0x1f;


        // float(4byte), double(8byte)
        float g = 10.0f;
        double h = 20.2d;
        // float i = 30.3; // error!! f를 붙여주어야 함!
        double i = 30.3; // double은 d 생략 가능!

        // boolean
        boolean j = true;
        boolean k = false;

        // char(16bit)
        char l = 'A';
        char n = '\n';
        // char k = ''; // error!! 반드시 한 글자 들어가야 한다!
        char m = ' ';

        // String(Class 이름이다!) => java.lang.String
        String o = "박민욱";
        String p = ""; // 글자 안 들어가도 된다!

        
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);
        System.out.println(m);
        System.out.println(n);
        System.out.println(o);
        System.out.println(p);
    }
}
