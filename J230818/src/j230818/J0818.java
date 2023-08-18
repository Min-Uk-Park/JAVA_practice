package j230818;


public class J0818 {
    public static void main(String[] args) throws Exception {
        // Instanceof
        Parent obj1 = new Parent();
        Parent obj2 = new Child();
        // Child obj3 = new Parent(); // (Child)class type이 선언하려는 Parent class보다 작은 개념이기 때문에 선언 불가!!
        
        // Object는 객체를 생성하는 class type으로 사용된다. 모든 객체를 만들 때 사용 가능하다!
        Object obj3 = new Parent();
        Object obj4 = new Child();

        System.out.println("obj1은 Parent의 객체인가? " + (obj1 instanceof Parent));
        System.out.println("obj1은 Child의 객체인가? " + (obj1 instanceof Child));
        System.out.println("obj1은 Kindof의 객체인가? " + (obj1 instanceof Kindof));

        System.out.println("obj2은 Parent의 객체인가? " + (obj2 instanceof Parent));
        System.out.println("obj2은 Child의 객체인가? " + (obj2 instanceof Child));
        System.out.println("obj2은 Kindof의 객체인가? " + (obj2  instanceof Kindof));
        
    }
}

class Parent {

}

interface Kindof {

}

class Child extends Parent implements Kindof {

}
