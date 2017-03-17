package OOP.Test17;

import java.util.List;

/**
 * Created by Ps1X on 31.01.2017.
 */
public class RepkaStory {

    public static void tell(List<Person> plot) {
        Person first;
        Person second;
        for (int i = plot.size() - 1;i > 0; i--) {
            second = plot.get(i-1);
            first = plot.get(i);
            first.pull(second);
        }
    }
}
