package gamehp;



// 질문??????????? 
// synchronized는 왜 발생하는지....?
public class GameHP {
    public static void main(String[] args) throws Exception {
        Attack a = new Attack();
        Recovery r = new Recovery(a);

        a.start();
        r.start();

       while(a.isAlive()) {

       }

       while(r.isAlive()) {
        r.interrupt();
       }
       
    }
}

// 체력이 기본 100인 유저, 공격(attack) 시 체력 10 감소, 0에 도달하면 체력 50 증가, 0 도달 횟수 3번이면 사망   





class Attack extends Thread {
    int value = 100;
    int count = 0;
    final Object lock = new Object();

    void add50() {
        synchronized(lock) {
            value += 50;
        }
        
        System.out.println("value가 " + value + "증가했습니다.");
    }
    
    public void run() {
        

        while(true) {
            
            synchronized(lock) {
                value -= 10;
                
                if (value < 0) {
                    value = 0;
                }

                if (value == 0) {
                    count += 1;
                }
            }
                
            
            System.out.println("value : " + value);
            
            

            if (count == 3) {
                return;  // main 함수에서 따로 처리해 주지 않아도 run() 동작 안에서 count 증가시키면서 run() 종료한다.
            }

            if (interrupted()) {
                return; // main함수에서 interrupted() 코드 작성하고 신호 보내야 run() 종료한다.
            }
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                
            }
        }

        
    }

}

class Recovery extends Thread {
    Attack a;

    Recovery(Attack a) {
        this.a = a;
    }
    
    public void run() {
        while(true) {

            if (a.value == 0 && a.count < 3) {
                a.add50();
            }

            if (interrupted()) {
                return;
            }

            try {
                Thread.sleep(100);
            } catch (Exception e) {
                
            }
        }
        
      
    }
}