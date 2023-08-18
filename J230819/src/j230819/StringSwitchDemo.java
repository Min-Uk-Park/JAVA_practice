package j230819;


// public class는 하나의 src 파일 안에 한 개만 있을 수 있다!!
public class StringSwitchDemo {
    static int getMonthNumber(String month) {

        int monthNumber = 0;

        switch (month.toLowerCase()) {
            case "jan": monthNumber = 1; break;
            case "feb": monthNumber = 2; break;
            case "march": monthNumber = 3; break;
            case "april": monthNumber = 4; break;
            case "may": monthNumber = 5; break;
            case "june": monthNumber =6; break;
            case "july": monthNumber = 7; break;
            case "august": monthNumber = 8; break;
            case "septem": monthNumber = 9; break;
            case "october": monthNumber = 10; break;
            case "november": monthNumber = 11; break;
            case "december": monthNumber = 12; break;
            default: monthNumber = 0; break;
        }
        
        

        return monthNumber;
    }
}
