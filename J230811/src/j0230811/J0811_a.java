package j0230811;

import java.util.Scanner;

public class J0811_a {
    public static void main(String[] args) throws Exception {
        
        ABC a = new ABC();

        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        System.out.println("\n");

        a.printName(name);
        System.out.println("\n");
        a.printSir(name);
        System.out.println("\n");
        a.prinAll(name);
        System.out.println("\n");

        sc.close();
    }
}

class A {
    void printName(String name) {
        System.out.println(name);

    }
}

interface B {
    void printSir(String name);

}

interface C {
    void prinAll(String s);
}

class ABC extends A implements B,C {

    public void printSir(String name) {
        System.out.println(name + "님");
        
    }

    public void prinAll(String name) { // 상속받은 부모의 함수 혹은 interface 함수를 안에 구현 가능하다.
        printName(name);
        printSir(name);
    }

}