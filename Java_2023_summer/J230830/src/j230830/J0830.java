package j230830;


public class J0830 {
    public static void main(String[] args) throws Exception {
        // Thread class 상속받은 class 사용
        MyT t1 = new MyT();
        
        // Runnable interface 구현한 class 사용
        MyR r = new MyR();
        Thread t2 = new Thread(r);

        // // t1.run();
        // // t2.run();

        // // .start() 의 경우 Thread 시작 요청의 역할을 수행 => 그 후 임의의 시점 후에 run() 동작 실행
        // t1.start();
        // t2.start();

        t1.start();
        t2.start();
        
        while(t1.isAlive() && t2.isAlive()) {
            if (Math.abs(t1.number - r.number) >= 2) {
                while(t1.isAlive()) {
                    t1.interrupt();
                }
                
            }
        }
        

        
    }
}

class MyT extends Thread {
    int number = 0;
    public void run() {

        for(int i = 1; i <= 10; i++) {
            System.out.println("t" + number++);

            try {
                sleep(5000); // 상위 class(부모 class)를 가지고 있으므로 바로 사용 가능하다.
            } catch (Exception e) {

            }

            if (interrupted()) {
                System.out.println("t is stop!!");
                return;
            }
        }

        
    }

}

class MyR implements Runnable {
    int number = 0;

    public void run() {
        for(int i = 1; i <= 10; i++) {
            System.out.println("r" + number++);

            try {
                Thread.sleep(1000); 
            } catch (Exception e) {

            }
        }
    }

}