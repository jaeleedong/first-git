import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashMapEx2 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("김", new Integer(100));
        map.put("이", new Integer(100));
        map.put("강", new Integer(80));
        map.put("인", new Integer(90));

        HashSet set1 = new HashSet();
        set1.add("d");

        Set set = map.entrySet();
        Iterator it = set.iterator();

        System.out.println(set.size());
        System.out.println("set" + set); //
        System.out.println("map" + map); // {}
        System.out.println("map" + map); // {}
        System.out.println("HashSet" + set1); //
    }
}
// set []  map {}
