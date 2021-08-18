package functional;

@FunctionalInterface
public interface BuFunctional<T, R ,S ,M,N> {
        T get(R r,S s,M m,N n);
}
