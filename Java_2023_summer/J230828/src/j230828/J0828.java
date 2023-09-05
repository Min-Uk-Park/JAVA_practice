package j230828;

import java.util.*;

public class J0828 {
    public static void main(String[] args) throws Exception {


        Scanner sc = new Scanner(System.in);

        List<Score> a = new ArrayList<>();

        

        while (sc.hasNext()) { // ctrl + c 입력해서 중지해야한다 => 더 이상 다음 토큰을 가지지 못하기 때문에 반복 종료!

            String name = sc.next();
            int kor = sc.nextInt();
            int eng = sc.nextInt();
            int math = sc.nextInt();

            Score student = new Score(name, kor, eng, math);

            a.add(student);
            
        }

        System.out.println(a);

        // 중요 ★
        for (Score s : a) {
            s.printStates();
            s.sum();
            s.avg();
            s.grade();
            System.out.println();
        }

        sc.close();
    }
}





class Score {
    private String name;
    private int kor;
    private int eng;
    private int math;

    Score(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;

    }

    void sum() {
        int sum = 0;

        sum = kor + eng + math;

        System.out.println("합계 : " + sum);
    }

    void avg() {
        int sum = 0;
        double avg = 0;

        sum = kor + eng + math;

        avg = sum / 3.0;

        System.out.printf("평균 : %.1f\n", avg);
        

    }


    void grade() {
        double avg = (kor + eng + math) / 3.0;
        // String n = Integer.toString((int)(avg/10));

        

        String grade;

        switch ((int)(avg/10)) {

            case 10 :
            case 9 : grade = "A"; break;
            case 8 : grade = "B"; break;
            case 7 : grade = "C"; break;
            case 6 : grade = "D"; break;
            default : grade = "F";

        }

        System.out.println("평점 : " + grade);
    }

    void printStates() {
        System.out.println("성명 : " + name + ", 국어 : " + kor + ", 수학 : " + math + ", 영어 : " + eng);
    }
}
