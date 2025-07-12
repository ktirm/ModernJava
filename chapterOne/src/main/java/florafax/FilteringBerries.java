package florafax;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FilteringBerries {
    public static void main(String[] args) {
        List<Berry> berryList = Arrays.asList(
                new Berry(10, "red", "strawberry"),
                new Berry(2, "blue", "round"),
                new Berry(1, "pink", "raspberry"),
                new Berry(12, "red", "round")
        );
        System.out.println("All Berries: " + berryList);
        List<Berry> roundBerries = filterBerries(berryList, FilteringBerries::isRound);
        System.out.println("Round Berries: " + roundBerries);
    }

    /**
     * Filters red berries
     * @param inventory
     * @return list of red berries from inventory
     * PRE JAVA 8, this is what people had to do.
     */
    public static List<Berry> filterRedBerries(List<Berry> inventory) {
        List<Berry> result = new ArrayList<>();
        for (Berry berry : inventory) {
            if ("berry".equals(berry.getColor())) {
                result.add(berry);
            }
        }
        return result;
    }

    /**
     * Java 8 makes it possible to pass the code of the condition as an argument,
     * avoiding code duplication of the filter method.
     * You can now write this:
     */
    static List<Berry> filterBerries(List<Berry> inventory,
                                    Predicate<Berry> p) {
        List<Berry> result = new ArrayList<>();
        for (Berry berry: inventory){
            if (p.test(berry)) {
                result.add(berry);
            }
        }
        return result;
    }

    /**
     *
     * @param berry
     * @return true if berry has a round shape
     */
    public static boolean isRound(Berry berry) {
        return "round".equals(berry.getShape());
    }

}

