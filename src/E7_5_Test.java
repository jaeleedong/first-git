public class E7_5_Test {
    public static void main(String[] args) {
        Point2 p2 = new Point2();
    }
}

class Point1{
    int x = 10;
    int y = 20;

    Point1(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
class Point2 extends Point1 {
    int z =10;

    Point2() {
        this(1,2,3);
    }
    Point2(int x, int y, int z) {
        super(x,y);
        this.z = z;
    }
}
// Child() -> Child(int x) -> Parent() -> Parent(int x) -> Object()
