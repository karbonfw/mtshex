package karbonfw.mtshex.app.shared;

import java.util.Arrays;

public interface SecurityGuard {

    boolean hasRole(Role role);

    default <T> T requireRole(Role role, SecureHandler<T> handler) {
        return requireAllRoles(new Role[]{role}, handler);
    }

    default <T> T requireAllRoles(Role[] roles, SecureHandler<T> handler) {
        if (Arrays.stream(roles).allMatch(this::hasRole)) {
            return handler.accept();
        } else {
            // TODO introduce business exception
            throw new RuntimeException("Access denied");
        }
    }

    default <T> T requireAnyRoles(Role[] roles, SecureHandler<T> handler) {
        if (Arrays.stream(roles).anyMatch(this::hasRole)) {
            return handler.accept();
        } else {
            // TODO introduce business exception
            throw new RuntimeException("Access denied");
        }
    }
}
