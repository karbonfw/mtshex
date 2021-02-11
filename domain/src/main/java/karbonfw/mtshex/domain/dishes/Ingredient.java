package karbonfw.mtshex.domain.dishes;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;

/** Ingredient Value Object. */
@Data
@Builder
public final class Ingredient {
  private final String name;
  private final String description;
  private final BigDecimal price;
}
