package karbonfw.mtshex.domain.shared;

@FunctionalInterface
public interface TransactionalHandler<T> {
    T accept();
}
