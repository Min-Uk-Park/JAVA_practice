package j230828;

public class Test2 {
    public static void main(String[] args) throws Exception {

        int length = 20;
        int k = 0;
        int c =  0;
        
        for(int y = 0; y < 20; y++) {

            if(y > 9) {
                
                c = (y < 11) ? 9 : --c;
                

                for(int x = 0; x < 20; x++) {
                
                    k = x < 10 ? c : length;
                    
                    if (x >= k) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }

                }
                
                length++;
                System.out.println();

            }

            else {
                for(int x = 0; x < 20; x++) {
                    
                    k = x < 10 ? k : length-1;

                    if (x <= k) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                length--;
                k = 20 - length;
                System.out.println();
            }
        }
        

    }
}
