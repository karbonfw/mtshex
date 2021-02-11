package karbonfw.mtshex.app.dishes;

import karbonfw.mtshex.app.shared.Roles;
import karbonfw.mtshex.app.shared.SecurityGuard;
import karbonfw.mtshex.domain.dishes.Dish;
import karbonfw.mtshex.domain.dishes.DishId;
import karbonfw.mtshex.domain.dishes.DishRepository;

import java.util.Optional;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DishFacade {

  private final SecurityGuard sec;
  private final DishRepository dishRepository;
  private final DishQuery dishQuery;

  public Optional<Dish> findById(DishId id) {
    return sec.requireRole(Roles.DISHES, () -> dishRepository.findById(id));
  }
}
