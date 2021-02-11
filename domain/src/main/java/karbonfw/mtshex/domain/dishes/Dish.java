package karbonfw.mtshex.domain.dishes;

import java.math.BigDecimal;
import java.util.List;

import lombok.Builder;
import lombok.Data;

/** Dish Entity. */
@Data
@Builder
public final class Dish {
  private DishId id;
  private String name;
  private String description;
  private BigDecimal price;
  private Long imageId;
  private List<Ingredient> ingredients;
}
