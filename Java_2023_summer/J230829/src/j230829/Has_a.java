package j230829;


public class Has_a {
    public static void main(String[] args) throws Exception {
        Rectangle r = new Rectangle(new Point(0,0), 5, 4);

        r.getArea();
        r.move(2, 3);
        r.getArea();

        // List만들어서 여러 직사각형 찍어내고 반복문으로 getArea() 출력해보기
    } 
}
