import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NullTest {
    public static void main(String[] args) {
        // ArrayList 예제
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(null);
        arrayList.add(2);
        System.out.println("ArrayList: " + arrayList); // 출력 예: [Hello, null, World]

        // LinkedList 예제
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(null);
        linkedList.add(2);
        System.out.println("LinkedList: " + linkedList); // 출력 예: [Hello, null, World]
    }
}
