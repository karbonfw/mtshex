package karbonfw.mtshex.store.dishes;

import karbonfw.mtshex.domain.dishes.Dish;
import karbonfw.mtshex.domain.dishes.DishId;
import karbonfw.mtshex.domain.dishes.DishRepository;
import karbonfw.mtshex.domain.dishes.Ingredient;

import java.util.Optional;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DishJpaRepository implements DishRepository {

  private final DishDao dishDao;

  @Override
  public Optional<Dish> findById(DishId id) {
    return dishDao
        .findById(id.getId())
        .map(
            dishRec ->
                Dish.builder()
                    .id(new DishId(dishRec.getId(), dishRec.getModificationCounter()))
                    .name(dishRec.getName())
                    .description(dishRec.getDescription())
                    .price(dishRec.getPrice())
                    .imageId(dishRec.getImageId())
                    .ingredients(
                        dishRec.getExtras().stream()
                            .map(
                                ingredientRec ->
                                    Ingredient.builder()
                                        .name(ingredientRec.getName())
                                        .description(ingredientRec.getDescription())
                                        .price(ingredientRec.getPrice())
                                        .build())
                            .collect(Collectors.toList()))
                    .build());
  }
}
