package j230810;

public class J0810 {
    public static void main(String[] args) throws Exception {

        // a, b 객체 두 개 생성
        Test a = new Test();
        Test b = new Test();

        a.setData("kim", 50);
        b.setData("park", 60);

        a.printStates();
        System.out.println("\n\n");
        b.printStates();
    }
}

// Variables(변수) - 4가지
class Test {

    String name; // Instance Variables(인스턴스 변수) => non-static variables(only!! 객체 생성하여 사용)

    static double score; // Class Variables(클래스 변수) => static variables(객체 생성하여 사용 + "클래스명.필드명" 가능!!)
                        // 공유한다는 특징이 있다!! 변수의 값을 바꾸면 해당 클래스를 사용한 객체들 모두 같은 값을 같는다!
    void setData(String name, double score) { // name, score는 parameters(매개변수)

        double defualt = 10.0; // Local variables(지역변수)

        this.name = name;
        this.score = score + defualt;
    }

    void printStates() {
        System.out.println("이름 : " + name + "\n점수 : " + score);
    }

}