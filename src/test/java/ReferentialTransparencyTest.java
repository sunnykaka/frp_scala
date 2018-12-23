import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ReferentialTransparencyTest {

    @Test
    public void testTp() {
        List<Integer> list = new ArrayList<>();
        System.out.println("=========addContentReferentialTransparency===========");
        System.out.println(addContentReferentialTransparency(list, 1));
        System.out.println(addContentReferentialTransparency(list, 1));
        System.out.println("=========addContent===========");
        System.out.println(addContent(list, 1));
        System.out.println(addContent(list, 1));

    }

    public static List<Integer> addContent(List<Integer> list, Integer num) {
        list.add(num);
        return list;
    }

    public static List<Integer> addContentReferentialTransparency(List<Integer> list, Integer num) {
        List<Integer> results = new ArrayList<>(list);
        results.add(num);
        return results;
    }


}
