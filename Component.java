import java.util.Objects;

class Component {
    String name;
    String weight;
    int power;

    public Component(String name, String weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Component component = (Component) obj;
        return power == component.power &&
                Objects.equals(name, component.name) &&
                Objects.equals(weight, component.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, power);
    }
}

