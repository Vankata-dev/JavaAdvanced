package ListUtilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();

        Collections.addAll(integers, 1,2,18,2,-1);

        Integer maxInt = ListUtils.getMax(integers);

        System.out.println(maxInt);


        List<String> stringList = new ArrayList<>();

        Collections.addAll(stringList, "a", "b", "c");
        String minString = ListUtils.getMin(stringList);
        System.out.println(minString);
    }
}
