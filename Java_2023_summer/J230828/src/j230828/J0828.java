package j230828;


public class J0828 {
    public static void main(String[] args) throws Exception {

        Score student1 = new Score("박민욱", 98, 88, 70);
        Score student2 = new Score("박민욱", 100, 78, 60);
        

        student1.grade();
        System.out.println();
        student2.grade();
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

    void sum(int kor, int eng, int math) {
        int sum = 0;

        sum = kor + eng + math;

        System.out.println(sum);
    }

    void avg() {
        int sum = 0;
        double avg = 0;

        sum = kor + eng + math;

        avg = sum / (double)3;

        System.out.printf("%.1f",avg);
        

    }


    void grade() {
        double avg = (kor + eng + math) / (double)3;
        String n = Integer.toString((int)(avg/10));

        String grade;

        switch(n) {

            case "9" : grade = "A"; break;
            case "8" : grade = "B"; break;
            case "7" : grade = "C"; break;
            case "6" : grade = "D"; break;
            default : grade = "E"; break;

        }

        System.out.println(grade);
    }
}
