package j230907;

public class Concurrency {
    public static void main(String[] args) throws Exception {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        a.start();
        b.start();
        c.start();
        d.start();

        while(a.isAlive()) {
            if (A.color == 0) {
                a.interrupt();
                b.interrupt();
                c.interrupt();
                d.interrupt();
            }
        }
    }
}

class Cst {
    static final int Time_SUN = 3000;
    static final int Time_OUT = 1000;
    static final int Time_PNT = 2000;
}

class A extends Thread {
    static int light = 0;
    static int stack_light = 0;
    static int water = 100;
    static int color = 30;

    public void run() {

        while(true) {
            if (color == 0) {
                while(true) {
                    if (Thread.interrupted()) {
                        return;
                    }
                }
                
            }
            if (light == 15) {
                light -= 1;
            }
            else {
                light += 1;
            }

            stack_light += light;
            
            try {
                Thread.sleep(Cst.Time_SUN);
            } catch (Exception e) {
            
            }
        }
        
    }
}

class B extends Thread {
    public void run() {
        while(true) {
            if (A.color == 0) {
                while(true) {
                    if (Thread.interrupted()) {
                        return;
                    }
                }
                
            }
            System.out.println("현재 일사량(" + A.light +")" + " 빛(" + A.stack_light + ")" + " 물(" + A.water + ")" + " 잎(" + A.color + ")");
            

            try {
                Thread.sleep(Cst.Time_OUT);
            } catch (Exception e) {
            
            }
        }
            
    }
}

class C extends Thread {
    public void run() {
        while(true) {
            if (A.color == 0) {
                while(true) {
                    if (Thread.interrupted()) {
                        return;
                    }
                }
                
            }

            if (A.water < 25 || A.light < 15) {
                A.color -= 5;
            }
            else {
                A.water -= 25;
                A.light -= 15;
                A.color += 5;
            }

            try {
                Thread.sleep(Cst.Time_PNT);
            } catch (Exception e) {
                
            }
        }
            
    }
}


class D extends Thread {
    public void run() {
        while(true) {
            if (A.interrupted()) {
                System.out.println("모든 Thread 종료");
                return;
            }

            try {
                sleep(5000);
            } catch (Exception e) {
                
            }
        }
            
    }
}