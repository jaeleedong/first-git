class Parent11 {
    int x=100;
    Parent11() {
        this(200);
    }
    Parent11(int x) {
        this.x = x;
    }
    int getX() {
        return x;
    }
}
class Child11 extends Parent {
    int x = 3000;
    Child11() {

    this(1000);
    }

    Child11(int x) {
        this.x = x;
    }
    int getX() {
        return x;
    }
}
class Exercise7_7 {
    public static void main(String[] args) {
        Child11 c = new Child11();
        System.out.println("x="+c.getX());
    }
}