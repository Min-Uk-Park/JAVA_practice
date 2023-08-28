package j230826;


// class는 public, non-modifier 두 접근 제한자를 사용할 수 있다.
// 아래에서 public을 지우면 자연스럽게 non-modifier로 설정이된다.
// 그러면 'j230826' 패키지 안에서는 J0826이라는 class가 접근이 가능하나
// 다른 패키지에서(예를 들어 J230809) import java.j230826.J0826해도(즉, 해당 클래스를 다른 패키지에 import해도) 
// 접근이 불가능하다!
public class J0826 extends Bicycle { // class 안에 하나의 public 가능!
     public static void main(String[] args) throws Exception {
        Bicycle defualt_b = new Bicycle(); // 기본 생성자 
        Bicycle parameter_b = new Bicycle(1,3,4);

        defualt_b.printstates();
        System.out.println();
        parameter_b.printstates();

        System.out.println();

        System.out.println(Bicycle.cadence);
        // System.out.println(Bicycle.gear); // non-static 변수 선언이므로 객체 생성 후 접근 가능
    }


}
