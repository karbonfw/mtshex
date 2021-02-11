package karbonfw.mtshex.app.shared;

@FunctionalInterface
public interface SecureHandler<T> {
  T accept();
}
