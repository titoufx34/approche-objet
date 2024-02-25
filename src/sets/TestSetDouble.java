package sets;

import java.util.*;

public class TestSetDouble {
    public static void main(String[] args) {

        Set<Double> test = new HashSet<>();
        test.add(1.5);
        test.addAll(Arrays.asList(1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01));

        double max = Collections.max(test);
        double min = Collections.min(test);

        System.out.println("le set est : " +test);
        System.out.println("la valeur max dans test est : "+max);
        System.out.println("la valeur min dans test est " +min);

        Iterator<Double> iterator = test.iterator();
        while (iterator.hasNext()) {
            Double element = iterator.next();
            if (element == min) {
                iterator.remove();
            }
        }
        System.out.println("le set est : " +test);




    }
}
