import java.util.Comparator;

public class Test {
    Comparator<String> comp = (s, t) ->

    {
        if (ignoreCase == true) {
            return s.compareToIgnoreCase(t);
        } else {
            return s.compareTo(t);
        }
    };
}
