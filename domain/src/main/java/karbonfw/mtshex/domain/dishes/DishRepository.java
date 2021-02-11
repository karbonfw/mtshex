package karbonfw.mtshex.domain.dishes;

import java.util.Optional;

public interface DishRepository {
  Optional<Dish> findById(DishId id);
}
