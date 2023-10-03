package test.demo.collection;

import java.util.Objects;

public class TestObject {
    private final String value;
    private final Integer number;

    public TestObject(String value, Integer number) {
        this.value = value;
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestObject that = (TestObject) o;
        return Objects.equals(value, that.value) && Objects.equals(number, that.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, number);
    }
}
