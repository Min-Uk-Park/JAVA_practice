package j230904;

import java.util.*;

public class ShareData {
    String lastName = "";
    int nameCount = 0;

    ArrayList<String> nameList = new ArrayList<>();

    final Object lock1 = new Object();
    final Object lock2 = new Object();

    void setLastName(String name) {
        synchronized(lock1) {
            lastName = name;
            nameCount++;
        }
    }

    void addName(String name) { // 261-3307
        synchronized(lock2) {
            nameList.add(name);
        }
    }

    void printstates() {
        System.out.println(lastName);
        System.out.println(nameCount);
        System.out.println(nameList);
        System.out.println();
    }
    
}


class MyT extends Thread {
    ShareData sd; // has-a 관계
    String[] names;
    int time;

    MyT(ShareData sd, String[] names, int time) {
        this.sd = sd;
        this.names = names;
        this.time = time;
    }

    public void run() {
        for (String name : names) {
            sd.setLastName(name);
            sd.addName(name);

            try {
                sleep(time);
            } catch (Exception e) {

            }

            
        }
        sd.printstates();
    }
}