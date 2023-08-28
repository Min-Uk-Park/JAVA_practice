package j230826;

public class CaculateSum {
    public void sumf(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("Sum : " + sum);
    }

    public void sumf(String num1, String num2) {
        int a = Integer.parseInt(num1);
        int b = Integer.parseInt(num2);
        int sum = a + b;
        System.out.println("Sum : " + sum);
    }

    public void sumf(int... nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        
        System.out.println("Sum : " + sum);

    }
}
