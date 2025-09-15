package stepik.generic;

import java.util.Objects;

class Pair<T, V> {
    private final T t;
    private final V v;

    private Pair(T t, V v) {
        this.t = t;
        this.v = v;
    }

    public static <T, V> Pair<T, V> of(T t, V v) {
        return new Pair<>(t,v);
    }

    public T getFirst() {
        return t;
    }

    public V getSecond() {
        return v;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Pair<?,?>) {
            Pair<?,?> other = (Pair<?,?>) obj;
            return Objects.equals(t, other.t) && Objects.equals(v, other.v);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(t, v);
    }
}
