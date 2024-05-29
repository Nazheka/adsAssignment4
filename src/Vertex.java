import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Vertex <V> {
    private V data;
    private Map<Vertex<V>, Double> adjacentVertices;

    public Vertex(V data) {
        this.data = data;
        this.adjacentVertices = new HashMap<>();
    }

    public V getData() {
        return data;
    }

    public void addAdjacent(Vertex<V> destination, double weight) {
        adjacentVertices.put(destination, weight);
    }

    public Map<Vertex<V>, Double> getAdjacent() {
        return adjacentVertices;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Vertex<V> vertex = (Vertex<V>) o;
        return Objects.equals(data, vertex.data);
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
