package karbonfw.mtshex.domain.shared;

public interface BusinessTransaction {
    <T> T inTransaction(TransactionalHandler<T> handler);
}
