package setmana2.e12;

public class        Dau {
    private int value = 0;
    public int tirar() {
        value = (int)(Math.random() * 6) + 1;
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dau dau = (Dau) o;

        return value == dau.value;
    }

    @Override
    public int hashCode() {
        return value;
    }

    @Override
    public String toString() {
        return "Dau{" +
                "value=" + value +
                '}';
    }
}
