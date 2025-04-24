import java.util.ArrayList;

class Box<T> { // T 지네릭 타입 를 선언
    T item;
    void setItem(T item) { this.item = item; }
    T getItem() { return item; }
}

public class GenericT {
    public static void main(String[] args) {

//        Box<Object> b = new Box<String>();
        Box<Object> b = (Object)new Box<String>();
        new Box<String>().setItem(new Object());
        new Box<String>().setItem("ABC");


    }
}
//116 380

