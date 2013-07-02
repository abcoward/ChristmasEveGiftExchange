import java.util.Comparator;

public class SortFamily implements Comparator<Person> {
    public int compare(Person o1, Person o2) {
        return o1.getFamily_name().compareTo(o2.getFamily_name());
    }
}


