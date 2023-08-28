package j230826;

public class Bicycle {

    static int cadence;
    private int gear;
    private int speed;
    
    public Bicycle() { // 기본 생성자 정의

    }

    public Bicycle(int cadence, int gear, int speed) { 
        this.cadence = cadence;
        this.gear = gear;
        this.speed = speed;
    }

    public void printstates() {
        System.out.println(cadence + " " + gear + " " + speed);
    }
    
}


