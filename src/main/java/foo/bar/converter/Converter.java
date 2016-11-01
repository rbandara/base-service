package foo.bar.converter;

public interface Converter<U, V> {
    V convert(U u);
}
