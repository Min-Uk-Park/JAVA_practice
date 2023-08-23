package j230809;

public class J230809 {
    public static void main(String[] args) throws Exception {
        
        // Apple a = new Apple();
        // a.setData("dd",8,100);
        // a.printStates();


        ApplePro b = new ApplePro();
        
        b.setData("green", 8, 200);
        b.setPiece(5);
        b.removePeel();
        b.removeSeed();
        b.printStates();

    }
}

class Apple {
    String color;
    int diameter;
    int weight;
    int colorie;

    void setData(String color,int diameter,int weight) {
        if (color == "red" || color == "green" || color == "pink") {
            this.color = color; // 매개변수의 변수멷과 Instance 변수명과 같을 때 Instance 변수명을 가리킬 때 this를 사용!!
        }
        else {
            
            this.color = "red";
        }

        this.diameter = diameter;
        this.weight = weight;
        colorie = (weight / 100) * 48;
    }

    void printStates() {
        System.out.println(color + "\n" + diameter + "cm\n" + weight + "g\n" + colorie + "kcal");
    }

    String getColor() {
        return color;
    }
    
    int getDiameter() {
        return diameter;
    }

    int getWeight() {
        return weight;
    }
}

// Inheritance(상속) : extends(연장) 사용!! ex) Apple(부모)을 ApplePro(자식)에 연장한다.
// 부모는 하나다!!
class ApplePro extends Apple {
    int piece = 1;
    boolean peel = true;
    boolean seed = true;

    void setPiece(int piece) {
        if (this.piece < piece) {
            this.piece = piece;
        }
    }

    void removePeel() {
        peel = false;
    }

    void removeSeed() {
        seed = false;
    }

    int getPiece() {
        return piece;
    }

    boolean getPeel() {
        return peel;
    }

    boolean getSeed() {
        return seed;
    }

    void printStates() {
        super.printStates(); // 부모의 메소드 사용할 때 "super." 사용한다!!

        System.out.println(piece + "조각\n" + "껍질 여부 : " + peel + "\n씨앗 여부 : " + seed);
    }
}