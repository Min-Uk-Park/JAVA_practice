package j230820;


public class StarTest2 {
    public static void main(String[] args) throws Exception {


    // case 1
        // for (int i = 0; i < 10; i++) {
        //     for (int j = 0; j < 20; j++) {
        //         // 0, 9/ 1, 8/ 2, 7
        //         if ((j < 10 && j%10 <= i) || (j >= 10 && j%10 <= 9-i)) {
        //             System.out.print("*");
        //         }
        //         else {
        //             System.out.print(" ");
        //         }
        //     }

        //     System.out.println();

        // }

    
    // case 2
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                int k = (j < 10) ? j : -9 + (j%10) + i*2; 
                
                if (k > i) {
                    System.out.print(" ");
                    continue;
                }

                System.out.print("*");

            }
            System.out.print("\n");
        }

    }
}
