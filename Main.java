// import java.util.List;
// import java.util.ArrayList;
// import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Component component1 = new Component("Component A", "10mg", 50);
        Component component2 = new Component("Component B", "5mg", 30);

        Set<Component> components1 = new HashSet<>();
        components1.add(component1);
        components1.add(component2);

        Pharmacy pharmacy1 = new Pharmacy(components1);

        Set<Component> components2 = new HashSet<>();
        components2.add(component1);  
        components2.add(component2);  

        Pharmacy pharmacy2 = new Pharmacy(components2);
        Pharmacy pharmacy3 = new Pharmacy(new HashSet<>());  

        Set<Pharmacy> result = new HashSet<>();
        result.add(pharmacy1);
        result.add(pharmacy2);
        result.add(pharmacy3);

        System.out.println(result.size());  // Результатом должно быть количество УНИКАЛЬНЫХ экземпляров аптеки
    }
}