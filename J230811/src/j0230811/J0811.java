package j0230811;


public class J0811 {
    public static void main(String[] args) throws Exception {
        
        ACMEBicycle a = new ACMEBicycle();

        a.changecadence(50);
        a.changeGear(5);
        a.applyBrakes(1);
        a.speedUp(8);

        a.printStates();
    }
}


interface Bicycle { // Class 이름 첫 글자는 대문자! (예외) interface 이름 첫 글자도 대문자이다!!
    // interface에서는 Mmethod의 prototype(return type, Method Name, Parameters)을 선언함. (body(내용)은 선언하지 않는다.)
    void changecadence(int new_value);
    void speedUp(int increment);
    void applyBrakes(int decrement);
    void changeGear(int new_Value);
}

class ACMEBicycle implements Bicycle {
    int cadence = 0;
    int speed = 0;
    int gear = 1;

    public void changecadence(int value) { // type은  Interface와 같아야한다! 변수명은 달라도 된다!
        cadence = value;
    }

    public void speedUp(int increment) {
        speed = speed + increment;
    }

    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    public void changeGear(int Value) { // 변수명은 달라도 된다!
        gear = Value;
    }

    void printStates() {
        System.out.println("cadence : " + cadence + "\nspeed : " + speed + "\ngear : " + gear);
    }
}