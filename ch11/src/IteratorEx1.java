import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx1 {
    public static void main(String[] args) {
        ArrayList list5 = new ArrayList();
        list5.add("1");
        list5.add("2");

        list5.add("3");
        list5.add("4");
        list5.add("5");

        Iterator it = list5.iterator();

        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}
