package generic.basic;

public class GenericClass<T> {
    private T object;

    public GenericClass() {
    }

    public GenericClass(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

}
