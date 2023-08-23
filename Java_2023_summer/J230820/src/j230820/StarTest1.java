package j230820;



public class StarTest1 {
    public static void main(String[] args) throws Exception {

        int j = 0;
        int count = 0;

        // for(int i = 0; i < 10; i++) {
        //     count = 0;
        //     while(true) {
        //         for(j = 0; j < i + 1; j++) {
        //             System.out.print("*");
        //         }
        //         for(j = i + 1; j < 10; j++) {
        //             System.out.print(" ");
        //         }

        //         count++;
        //         if (count == 2) break;

        //     }
            

        //     System.out.println();
        // }

        for(int i = 0; i < 10; i++) {
            for(j = 0; j < 20; j++) {
                if (j % 10 <= count) {
                    System.out.print("*");
                }
                else System.out.print(" ");
                
            }
            count++;
            System.out.println();
        }



    }
}