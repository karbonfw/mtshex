package karbonfw.mtshex.domain.dishes;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * Dish Entity.
 */
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
