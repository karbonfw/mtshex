package karbonfw.mtshex.domain.dishes;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Ingredient Value Object.
 */
@Data
@Builder
public final class Ingredient {
    private final String name;
    private final String description;
    private final BigDecimal price;
}
