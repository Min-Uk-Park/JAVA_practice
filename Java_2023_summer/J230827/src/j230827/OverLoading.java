package j230827;

import j230826.CaculateSum; // 패키지.클래스명 선언할 때 J230826과 J230827의 폴더가 다른데 폴더도 같이 import 경로에 넣어주어야 하는거 아닌지..?

public class OverLoading {
    public static void main(String[] args) throws Exception {
        CaculateSum c = new CaculateSum();

        c.sumf("2", "3");
        c.sumf(2, 10);
        c.sumf(1,2,3,4,5,6,7,8,9,10);
    }
}
