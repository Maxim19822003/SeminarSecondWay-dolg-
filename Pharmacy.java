// import java.util.ArrayList;
// import java.util.Iterator;
// import java.util.List;
import java.util.Set;


class Pharmacy implements Comparable<Pharmacy> {
    Set<Component> components;

    public Pharmacy(Set<Component> components) {
        this.components = components;
    }

    @Override
    public int compareTo(Pharmacy o) {
        // Compare based on some criteria if needed
        return Integer.compare(this.hashCode(), o.hashCode());
    }
}
