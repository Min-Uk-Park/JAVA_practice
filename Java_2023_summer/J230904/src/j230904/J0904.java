package j230904;


public class J0904 {
    public static void main(String[] args) throws Exception {

        for(int i = 0; i < 10; i++){
            ShareData sd = new ShareData();

            String[] arr1 = {"a", "b", "c", "d", "e", "f", "g", "h"};
            String[] arr2 = {"1", "2", "3", "4", "5", "6", "7", "8","9"};

            MyT t1 = new MyT(sd, arr1, 200);
            MyT t2 = new MyT(sd, arr2, 300);

            t1.start();
            t2.start();

            while(t1.isAlive() || t2.isAlive()) {

            }

            
        }

    }
}

