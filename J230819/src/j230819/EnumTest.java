package j230819;

import java.util.Scanner;

enum Day {
    SUNDAY, MONDAY, TUESDAY, WENESDAY, THURSDAY, FRIDAY, SATURDAY
}



public class EnumTest {
    public static void main(String[] args) throws Exception {
        // class의 construtor(생성자) 정의 <=> default 생성자 추가되지 않는다!!
        ET aa = new ET(Day.MONDAY);
        aa.doIT();

        Scanner sc = new Scanner(System.in);

        String whatMonth = sc.next();

        StringSwitchDemo change_num = new StringSwitchDemo();
        
        int what_num = change_num.getMonthNumber(whatMonth);

        System.out.println(what_num);

    }
}

class ET {
    Day day;

    ET(Day day) {
        this.day = day;
    }

    void doIT() {
        switch (day) {
            case MONDAY : System.out.println("it's Monday"); break;
            case FRIDAY : System.out.println("it's Friday"); break;
            case SATURDAY : 
            case SUNDAY : System.out.println("Weekends are best"); break;
            default: System.out.println("remains are so-so"); break;

        }
    }
}