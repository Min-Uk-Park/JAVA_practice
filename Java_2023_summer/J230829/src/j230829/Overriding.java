package j230829;

public class Overriding {
    public static void main(String[] args) throws Exception {

        // Animal a = new Animal("nayong");
        // a.setWeight(2.55123);
        // a.getState();

        Cat c = new Cat("nayong", 2.53);
        c.getState();

        
    }

}

class Animal {
    String name;
    double weight = 0.0;

    public Animal(String name) { // 기본
        this.name = name;
    }

    public void setWeight(double w) {
        weight = w;
    }

    public void getState() {
        System.out.printf("%s: %.2f\n", name, weight);
    }

}

class Cat extends Animal {

    // super() !!
    public Cat(String name, double weight) {
       
        super(name); // 부모 class가 생성자 정의를 수동으로 하면 상속 받은 자식의 class의 생성자 정의 시 부모 개체 초기화
        setWeight(weight);
    }

    public void getState() {
        super.getState();

        double temp = weight + 0.05f;

        // System.out.println(temp);

        System.out.print(name + ": " + (((int)(temp * 10)) / 10.0) + "kg");
        
    }
}