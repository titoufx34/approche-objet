package sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSetString {
    public static void main(String[] args) {

        Set<String> teststring = new HashSet<>();
        teststring.addAll(Arrays.asList("USA", "France", "Allemagne", "UK", "Italie", "Japon", "Chine", "Russie", "Inde"));

        System.out.println(teststring);

        /*for (String item : teststring) {
            System.out.println(item);
        }*/

        int max = 0;
        String longword = "";
        for (String item : teststring) {
            if (item.length() > max){
                max = item.length();
                longword = item;
            }
        }
        System.out.println(longword);

        Iterator<String> iterator = teststring.iterator();
        while (iterator.hasNext()){
            String element = iterator.next();
            if (element == longword){
                iterator.remove();
            }
        }
        System.out.println(teststring);

    }
}
